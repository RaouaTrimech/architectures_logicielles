package com.directi.training.ocp.exercise.correction;

public class TimeSlot extends ResourceAllocator {

	public int allocate()
    {
        int resourceId;
        resourceId = findFreeRessource();
        markRessourceBusy(resourceId);
        return resourceId;
    }

    public void free( int resourceId)
    {
    	markRessourceFree(resourceId);
    }

	@Override
	protected void markRessourceFree(int resourceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void markRessourceBusy(int resourceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int findFreeRessource() {
		// TODO Auto-generated method stub
		return 0;
	}

}
