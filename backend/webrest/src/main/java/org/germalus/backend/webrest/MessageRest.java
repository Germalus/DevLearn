/*
 * Copyright
 */

package org.germalus.backend.webrest;

import org.germalus.backend.business.Factorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Rest implementation of controller.
 *
 * @since 0.0.1
 */
@RestController
@RequestMapping("test")
public class MessageRest implements MessageController {


    /**
     * Default contructor.
     * @param factorial Factorial calculator instance.
     */
    @Autowired
    public MessageRest(@Qualifier("flatFactorial") final Factorial factorial) {
        this.factorial = factorial;
    }


    @GetMapping("/factorial")
    @Override
    public final int getFactorial() {
        final int defaultval = 5;
        return this.factorial.calculate(defaultval);
    }

    @GetMapping("/message")
    @Override
    public final String getMessage() {
        return "My first string!";
    }
}
