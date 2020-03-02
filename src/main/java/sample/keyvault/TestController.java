/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package sample.keyvault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Value("${kkSecretPropertyName:kkDefaultSecret}")
    private String mySecretProperty;
    @Value("${myvalue:defaultValue}")
    private String myvalue;

    @GetMapping("configenv")
    public String checkConfigEnv() {
    LOGGER.debug("mySecretProperty ===>{}", mySecretProperty);
    return mySecretProperty;
    }
    @GetMapping("myvalue")
    public String checkMyValue() {
    LOGGER.debug("myvalue ===>{}", myvalue);
    return myvalue;
    }
    
}
