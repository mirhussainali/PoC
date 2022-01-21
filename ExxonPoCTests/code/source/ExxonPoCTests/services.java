package ExxonPoCTests;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.g11n.util.data.iso15924;
// --- <<IS-END-IMPORTS>> ---

public final class services

{
	// ---( internal utility methods )---

	final static services _instance = new services();

	static services _newInstance() { return new services(); }

	static services _cast(Object o) { return (services)o; }

	// ---( server methods )---




	public static final void transformString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(transformString)>> ---
		// @sigtype java 3.5
		// [i] field:1:required InputStringList
		// [i] field:0:required separator
		// [o] field:0:required concatString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String[]	InputStringList = IDataUtil.getStringArray( pipelineCursor, "InputStringList" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		if(separator == null)
			separator="";
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < InputStringList.length; i++) {
			sb.append(InputStringList[i]);
			if(i<InputStringList.length-1)
				sb.append(separator);
		}
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "concatString", sb.toString() );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

