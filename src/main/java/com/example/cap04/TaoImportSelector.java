package com.example.cap04;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
//该类放到配置类的@Import中
public class TaoImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回全类名的bean
        return new String[] {"com.example.cap04.Cat"};
    }
}
