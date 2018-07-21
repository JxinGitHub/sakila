package xyz.eazyfree.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by ZhaoZhi qiang
 * 2018/7/21.16:24
 */
@Data
public class Actor {

    private Integer actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;

}
