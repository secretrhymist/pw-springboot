package com.shareJoy.pw.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjt
 * @since 2022-08-19
 */
@TableName("pw_introduction")
@ApiModel(value = "Introduction对象", description = "")
public class Introduction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long mId;

    private String photo;

    private String price;

    private String describe;

    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Introduction{" +
            "id=" + id +
            ", mId=" + mId +
            ", photo=" + photo +
            ", price=" + price +
            ", describe=" + describe +
            ", nickname=" + nickname +
        "}";
    }
}
