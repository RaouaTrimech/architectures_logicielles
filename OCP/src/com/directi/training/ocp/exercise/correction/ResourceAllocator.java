package com.directi.training.ocp.exercise.correction;

import com.directi.training.ocp.exercise.ResourceType;

public abstract class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate()
    {
        int resourceId;
        System.out.println("ERROR: Attempted to allocate invalid resource");
        resourceId = INVALID_RESOURCE_ID;
        return resourceId;
    }

    public void free( int resourceId)
    {
            System.out.println("ERROR: attempted to free invalid resource");
    }

    abstract protected void markRessourceFree(int resourceId);

    abstract protected void markRessourceBusy(int resourceId);

    abstract protected int findFreeRessource();

}
