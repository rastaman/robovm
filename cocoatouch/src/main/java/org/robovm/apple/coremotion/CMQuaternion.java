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
package org.robovm.apple.coremotion;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMQuaternion/*</name>*/ 
    extends /*<extends>*/Struct<CMQuaternion>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMQuaternionPtr extends Ptr<CMQuaternion, CMQuaternionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMQuaternion() {}
    public CMQuaternion(double x, double y, double z, double w) {
        this.x(x);
        this.y(y);
        this.z(z);
        this.w(w);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double x();
    @StructMember(0) public native CMQuaternion x(double x);
    @StructMember(1) public native double y();
    @StructMember(1) public native CMQuaternion y(double y);
    @StructMember(2) public native double z();
    @StructMember(2) public native CMQuaternion z(double z);
    @StructMember(3) public native double w();
    @StructMember(3) public native CMQuaternion w(double w);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
