package plugin.enemydown.app.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.SpawnEnemy;
import plugin.enemydown.app.service.ConfigService;

@RestController
public class ConfigController {

  private final ConfigService service;

  public ConfigController(ConfigService service) {
    this.service = service;
  }

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public List<GameConfig> configList(){
    return service.searchConfigList();
  }
  @RequestMapping(value = "/config", method = RequestMethod.GET)
  public GameConfig config(@RequestParam String difficulty){
    return service.searchConfig(difficulty);
  }
  @RequestMapping(value = "/spawnEnemyList", method = RequestMethod.GET)
  public List<SpawnEnemy> spawnEnemyList(@RequestParam String difficulty){
    return service.searchSpawnEnemyList(difficulty);
  }

  @PostMapping(value = "/config")
  public ResponseEntity<GameConfig> registerConfig(@RequestBody GameConfig config) {
    GameConfig registerConfig = service.registerConfig(config);
    return new ResponseEntity<>(registerConfig, HttpStatus.OK);
  }
}
