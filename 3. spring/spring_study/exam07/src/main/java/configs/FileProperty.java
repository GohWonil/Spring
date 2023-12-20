package configs;

import lombok.Data;
import org.apache.ibatis.annotations.Property;
import org.springframework.context.annotation.Configuration;

@Data
public class FileProperty {
  private String url;
  private String path;

}
