package md59ee76e6e58d2e8d37e01f503ba67c2ac;


public class AndroidImageRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.Common.Android.AndroidImageRenderer, Telerik.XamarinForms.Common", AndroidImageRenderer.class, __md_methods);
	}


	public AndroidImageRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AndroidImageRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.AndroidImageRenderer, Telerik.XamarinForms.Common", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public AndroidImageRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AndroidImageRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.AndroidImageRenderer, Telerik.XamarinForms.Common", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AndroidImageRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AndroidImageRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.AndroidImageRenderer, Telerik.XamarinForms.Common", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
