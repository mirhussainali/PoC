package ExxonPoC;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void delayFlow (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(delayFlow)>> ---
		// @sigtype java 3.5
		// [i] object:0:required delayInMs
		try {
			
		
			// pipeline
			IDataCursor pipelineCursor = pipeline.getCursor();
				long	delayInMs = (Long)IDataUtil.get( pipelineCursor, "delayInMs" );
			pipelineCursor.destroy();
		
			// pipeline
		
			
			Thread.sleep(delayInMs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}
}

