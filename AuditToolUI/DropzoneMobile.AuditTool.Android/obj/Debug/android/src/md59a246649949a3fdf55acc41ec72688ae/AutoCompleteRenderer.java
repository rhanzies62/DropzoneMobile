package md59a246649949a3fdf55acc41ec72688ae;


public class AutoCompleteRenderer
	extends md59ee76e6e58d2e8d37e01f503ba67c2ac.AndroidRendererBase_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.AutoCompleteRenderer, Telerik.XamarinForms.Input", AutoCompleteRenderer.class, __md_methods);
	}


	public AutoCompleteRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AutoCompleteRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.AutoCompleteRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public AutoCompleteRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AutoCompleteRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.AutoCompleteRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AutoCompleteRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AutoCompleteRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.AutoCompleteRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
