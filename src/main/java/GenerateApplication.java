import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author hjt
 * @created 2022/8/16 16:41
 */

public class GenerateApplication {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/pw_market?serverTimezone=Asia/Shanghai&allowMultiQueries=true", "root", "root")
                .globalConfig(builder -> {
                    builder.author("hjt") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\w_pw\\pw-springboot\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.shareJoy.pw") // 设置父包名
//                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\w_pw\\pw-springboot\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
//                    builder.addInclude("pw_") // 设置需要生成的表名
                    builder.addTablePrefix("pw_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
