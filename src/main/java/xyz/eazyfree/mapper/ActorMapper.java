package xyz.eazyfree.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.eazyfree.domain.Actor;

import java.util.List;

/**
 * Created by ZhaoZhi qiang
 * 2018/7/21.16:29
 */
@Mapper
public interface ActorMapper {

    List<Actor> findAll();
}
