/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMenuItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIMenuItemPtr extends Ptr<UIMenuItem, UIMenuItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMenuItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    
    public interface OnActionListener {
        void onAction(UIMenuController menuController, UIMenuItem item);
    }
    
    private OnActionListener listener;
    private static final Selector handleAction = Selector.register("action:");
    
    @Method(selector = "action:")
    private void handleAction(UIMenuController menuController) {
        listener.onAction(menuController, this);
    }
    
    public UIMenuItem(OnActionListener listener) {
        if (listener != null) {
            this.listener = listener;
            setAction(handleAction);
            addStrongRef(this.listener);
        }
    }
    
    public UIMenuItem(String title, OnActionListener listener) {
        super((SkipInit) null); 
        if (listener != null) {
            initObject(init(title, handleAction));
            this.listener = listener;
            addStrongRef(this.listener);
        } else {
            initObject(init(title, null));
        }
    }
    
    /*<constructors>*/
    public UIMenuItem() {}
    protected UIMenuItem(SkipInit skipInit) { super(skipInit); }
    protected UIMenuItem(String title, Selector action) { super((SkipInit) null); initObject(init(title, action)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "action")
    protected native Selector getAction();
    @Property(selector = "setAction:")
    protected native void setAction(Selector v);
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public void setOnActionListener(OnActionListener listener) {
        if (listener == null && getAction() != null) {
            removeStrongRef(this.listener);
            this.listener = null;
        } else {
            this.listener = listener;
            setAction(handleAction);
            addStrongRef(this.listener);
        }
    }
    
    /*<methods>*/
    @Method(selector = "initWithTitle:action:")
    protected native @Pointer long init(String title, Selector action);
    /*</methods>*/
}
