package com.jiuxian.import_;

import com.jiuxian.import_.annotation.ImportSelectorConfiguration;
import com.jiuxian.import_.constant.EnumBeanSelector;
import org.springframework.context.annotation.Configuration;

/**
 * Author: jiuxian
 * Date: 2019-02-25 23:06:00
 * Comment:
 */

@ImportSelectorConfiguration(value = EnumBeanSelector.A)
@Configuration
public class ImportSelectorDemo {
}
