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

package me.juancarloscp52.entropy.mixin;

import me.juancarloscp52.entropy.Variables;
import net.minecraft.client.option.Perspective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Perspective.class)
public class PerspectiveMixin {

    @Inject(method = "isFirstPerson",at=@At("RETURN"), cancellable = true)
    private void isFirstPerson(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(cir.getReturnValue()&& !Variables.thirdPersonView);
    }
    @Inject(method = "isFrontView",at=@At("RETURN"), cancellable = true)
    private void isFrontView(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(cir.getReturnValue()&& !Variables.thirdPersonView || Variables.frontView);
    }
}
