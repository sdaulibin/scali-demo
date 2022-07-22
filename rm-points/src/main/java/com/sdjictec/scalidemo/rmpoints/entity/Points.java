package com.sdjictec.scalidemo.rmpoints.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`points`")
public class Points {
    @Id
    @Column(name = "member_id")
    private Integer memberId; //会员编号
    private Integer points; //新增积分
    public Points() {
    }
    public Points(Integer memberId, Integer points) {
        this.memberId = memberId;
        this.points = points;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
