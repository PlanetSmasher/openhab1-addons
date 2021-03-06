/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.lightwaverf.internal.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LightwaveRfDeviceRegistrationCommandTest {

    @Test
    public void test() throws Exception {
        String message = "10,!F*p\n";
        LightwaveRFCommand command = new LightwaveRfDeviceRegistrationCommand(message);
        assertEquals("010,!F*p\n", command.getLightwaveRfCommandString());
    }

}
