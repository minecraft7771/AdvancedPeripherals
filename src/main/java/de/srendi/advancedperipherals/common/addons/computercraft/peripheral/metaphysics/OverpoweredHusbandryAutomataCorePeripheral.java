package de.srendi.advancedperipherals.common.addons.computercraft.peripheral.metaphysics;

import dan200.computercraft.api.turtle.ITurtleAccess;
import dan200.computercraft.api.turtle.TurtleSide;
import de.srendi.advancedperipherals.common.addons.computercraft.operations.AutomataCoreTier;
import de.srendi.advancedperipherals.common.configuration.AdvancedPeripheralsConfig;

import java.util.Random;


public class OverpoweredHusbandryAutomataCorePeripheral extends HusbandryAutomataCorePeripheral {

    public static final String TYPE = "overpoweredHusbandryAutomata";

    public OverpoweredHusbandryAutomataCorePeripheral(ITurtleAccess turtle, TurtleSide side) {
        super(TYPE, turtle, side, AutomataCoreTier.OVERPOWERED_TIER2);
        setAttribute(ATTR_STORING_TOOL_DURABILITY);
    }

    public void addRotationCycle(int count) {
        super.addRotationCycle(count);
        if (new Random().nextDouble() <= AdvancedPeripheralsConfig.overpoweredAutomataBreakChance)
            owner.destroyUpgrade();
    }
}
