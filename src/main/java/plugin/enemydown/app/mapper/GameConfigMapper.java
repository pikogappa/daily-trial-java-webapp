package plugin.enemydown.app.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.PlayerScore;

@Mapper
public interface GameConfigMapper {
  @Select("select * from game_config")
  List<GameConfig> selectConfigList();

}
