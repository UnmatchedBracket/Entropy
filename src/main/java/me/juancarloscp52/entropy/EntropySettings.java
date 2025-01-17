/*
 * Copyright (c) 2021 juancarloscp52
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.juancarloscp52.entropy;

import java.util.ArrayList;
import java.util.List;

public class EntropySettings {

    public enum UIStyle {
        GTAV, MINECRAFT
    }

    public enum VotingMode{
        MAJORITY, PROPORTIONAL
    }
    public short timerDuration = 900;
    public short baseEventDuration = 600;
    public boolean integrations = false;
    public VotingMode votingMode = VotingMode.PROPORTIONAL;
    public UIStyle UIstyle = UIStyle.GTAV;
    public List<String> disabledEvents = new ArrayList<>();
}
