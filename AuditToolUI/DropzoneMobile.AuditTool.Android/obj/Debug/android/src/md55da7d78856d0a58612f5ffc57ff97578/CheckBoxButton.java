package md55da7d78856d0a58612f5ffc57ff97578;


public class CheckBoxButton
	extends android.widget.Button
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onInitializeAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V:GetOnInitializeAccessibilityEvent_Landroid_view_accessibility_AccessibilityEvent_Handler\n" +
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_accessibility_AccessibilityNodeInfo_Handler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.PrimitivesRenderer.Android.CheckBox.CheckBoxButton, Telerik.XamarinForms.Primitives", CheckBoxButton.class, __md_methods);
	}


	public CheckBoxButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CheckBoxButton.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.CheckBox.CheckBoxButton, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CheckBoxButton (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CheckBoxButton.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.CheckBox.CheckBoxButton, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CheckBoxButton (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CheckBoxButton.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.CheckBox.CheckBoxButton, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CheckBoxButton (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CheckBoxButton.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.CheckBox.CheckBoxButton, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onInitializeAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0)
	{
		n_onInitializeAccessibilityEvent (p0);
	}

	private native void n_onInitializeAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0);


	public void onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0)
	{
		n_onInitializeAccessibilityNodeInfo (p0);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

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
