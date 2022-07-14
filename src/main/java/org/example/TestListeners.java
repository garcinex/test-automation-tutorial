package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;

import java.time.Duration;
import java.time.LocalDateTime;

public class TestListeners implements ITestListener {

    private static final Logger LOG = LogManager.getLogger(TestListeners.class);
    private LocalDateTime testRunStart;

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        LocalDateTime startTime = LocalDateTime.now();
        testRunStart = startTime;
        LOG.info("TEST RUN STARTED AT: " + startTime);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        LocalDateTime finishTime = LocalDateTime.now();
        LOG.info("TEST RUN FINISHED AT: " + finishTime);

        Duration between = Duration.between(testRunStart, finishTime);
        LOG.info("TESTED IN: " + between.toSeconds() + "s");
    }
}