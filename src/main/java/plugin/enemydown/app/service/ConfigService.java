package plugin.enemydown.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.enemydown.app.mapper.GameConfigMapper;
import plugin.enemydown.app.mapper.data.GameConfig;

@Service
public class ConfigService {

  private final GameConfigMapper mapper;

  public ConfigService(GameConfigMapper mapper) {
    this.mapper = mapper;
  }

  public List<GameConfig> searchConfig() {
    return mapper.selectConfigList();
  }
}
