package com.yeqifu.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: yeqifu
 * @date: 2023/12/9 21:35
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("====================================================");
        String className = annotationMetadata.getClassName();
        System.out.println("className test:" + className);
        boolean isHave = annotationMetadata.hasAnnotation("org.springframework.context.annotation.Configuration");
        System.out.println(("isHave:" + isHave));
        System.out.println("====================================================");
        if (isHave) {
            return new String[]{"com.yeqifu.bean.Cat"};
        }
        return new String[]{"com.yeqifu.bean.Dog"};
    }
}
