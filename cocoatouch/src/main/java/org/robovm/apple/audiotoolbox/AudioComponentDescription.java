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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioComponentDescription/*</name>*/ 
    extends /*<extends>*/Struct<AudioComponentDescription>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioComponentDescriptionPtr extends Ptr<AudioComponentDescription, AudioComponentDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioComponentDescription() {}
    public AudioComponentDescription(int componentType, int componentSubType, int componentManufacturer, int componentFlags, int componentFlagsMask) {
        this.componentType(componentType);
        this.componentSubType(componentSubType);
        this.componentManufacturer(componentManufacturer);
        this.componentFlags(componentFlags);
        this.componentFlagsMask(componentFlagsMask);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int componentType();
    @StructMember(0) public native AudioComponentDescription componentType(int componentType);
    @StructMember(1) public native int componentSubType();
    @StructMember(1) public native AudioComponentDescription componentSubType(int componentSubType);
    @StructMember(2) public native int componentManufacturer();
    @StructMember(2) public native AudioComponentDescription componentManufacturer(int componentManufacturer);
    @StructMember(3) public native int componentFlags();
    @StructMember(3) public native AudioComponentDescription componentFlags(int componentFlags);
    @StructMember(4) public native int componentFlagsMask();
    @StructMember(4) public native AudioComponentDescription componentFlagsMask(int componentFlagsMask);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
