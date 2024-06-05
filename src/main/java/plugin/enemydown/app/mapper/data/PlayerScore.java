package plugin.enemydown.app.mapper.data;

/**
 * プレイヤーのスコア情報を扱うオブジェクト
 * DBに存在するテーブルと連動する
 */

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class PlayerScore {

  private int id;
  private String playerName;
  private int score;
  private String difficulty;
  private LocalDateTime registeredAt;

}
