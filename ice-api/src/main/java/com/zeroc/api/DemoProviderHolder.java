// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `Demo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.zeroc.api;

public final class DemoProviderHolder extends Ice.ObjectHolderBase<DemoProvider>
{
    public
    DemoProviderHolder()
    {
    }

    public
    DemoProviderHolder(DemoProvider value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof DemoProvider)
        {
            value = (DemoProvider)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _DemoProviderDisp.ice_staticId();
    }
}