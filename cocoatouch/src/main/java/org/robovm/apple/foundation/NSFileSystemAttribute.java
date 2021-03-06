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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Foundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileSystemAttribute/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(NSFileSystemAttribute.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static final NSFileSystemAttribute Number = new NSFileSystemAttribute("NumberAttribute");
    public static final NSFileSystemAttribute Size = new NSFileSystemAttribute("SizeAttribute");
    public static final NSFileSystemAttribute FreeSize = new NSFileSystemAttribute("FreeSizeAttribute");    
    public static final NSFileSystemAttribute Nodes = new NSFileSystemAttribute("NodesAttribute");
    public static final NSFileSystemAttribute FreeNodes = new NSFileSystemAttribute("FreeNodesAttribute");
    private static NSFileSystemAttribute[] values = new NSFileSystemAttribute[] {Number, Size, FreeSize, Nodes, FreeNodes};
    
    private final LazyGlobalValue<NSString> lazyGlobalValue;
    
    private NSFileSystemAttribute(String getterName) {
        lazyGlobalValue = new LazyGlobalValue<>(getClass(), getterName);
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSString value() {
        return lazyGlobalValue.value();
    }
    
    public static NSFileSystemAttribute valueOf(NSString value) {
        for (NSFileSystemAttribute v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSFileSystemAttribute/*</name>*/.class.getName());
    }
    /*<methods>*/
    @GlobalValue(symbol="NSFileSystemNumber", optional=true)
    protected static native NSString NumberAttribute();
    @GlobalValue(symbol="NSFileSystemSize", optional=true)
    protected static native NSString SizeAttribute();
    @GlobalValue(symbol="NSFileSystemFreeSize", optional=true)
    protected static native NSString FreeSizeAttribute();
    @GlobalValue(symbol="NSFileSystemNodes", optional=true)
    protected static native NSString NodesAttribute();
    @GlobalValue(symbol="NSFileSystemFreeNodes", optional=true)
    protected static native NSString FreeNodesAttribute();
    /*</methods>*/
}
