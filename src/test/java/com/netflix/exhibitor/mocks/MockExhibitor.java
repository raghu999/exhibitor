package com.netflix.exhibitor.mocks;

import com.netflix.exhibitor.Exhibitor;
import com.netflix.exhibitor.InstanceConfig;
import com.netflix.exhibitor.spi.GlobalSharedConfig;
import com.netflix.exhibitor.spi.ProcessOperations;

public class MockExhibitor extends Exhibitor
{
    public MockExhibitor(InstanceConfig instanceConfig, GlobalSharedConfig globalSharedConfig, ProcessOperations processOperations)
    {
        super(instanceConfig, globalSharedConfig, processOperations);
    }
}