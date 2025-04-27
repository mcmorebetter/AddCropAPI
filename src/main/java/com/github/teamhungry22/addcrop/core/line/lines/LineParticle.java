package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

public class LineParticle extends AbstractLine {
    public LineParticle(Map<String, String> stringMap, boolean containsPAPI) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineParticle build(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    private static LineParticle parseLine(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    public Line parsedPAPILine(Player player) {
        throw new AddCropNotFoundException();
    }

    @Override
    protected void lineMap(Map<String, Object> lineMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    protected void run(Entity entity, Location location, Map<String, Object> lineMap) {
        throw new AddCropNotFoundException();
    }

    private Object getParticleData(Particle particle, Map<String, Object> lineMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    public LineType getType() {
        throw new AddCropNotFoundException();
    }

    public Particle getParticle() {
        throw new AddCropNotFoundException();
    }

    public void setParticle(Particle particle) {
        throw new AddCropNotFoundException();
    }

    public double getOffsetX() {
        throw new AddCropNotFoundException();
    }

    public void setOffsetX(double offsetX) {
        throw new AddCropNotFoundException();
    }

    public double getOffsetY() {
        throw new AddCropNotFoundException();
    }

    public void setOffsetY(double offsetY) {
        throw new AddCropNotFoundException();
    }

    public double getOffsetZ() {
        throw new AddCropNotFoundException();
    }

    public void setOffsetZ(double offsetZ) {
        throw new AddCropNotFoundException();
    }

    public int getAmount() {
        throw new AddCropNotFoundException();
    }

    public void setAmount(int amount) {
        throw new AddCropNotFoundException();
    }

    public double getSpeed() {
        throw new AddCropNotFoundException();
    }

    public void setSpeed(double speed) {
        throw new AddCropNotFoundException();
    }

    public boolean isParticleForce() {
        throw new AddCropNotFoundException();
    }

    public void setParticleForce(boolean particleForce) {
        throw new AddCropNotFoundException();
    }

    public String getMaterial() {
        throw new AddCropNotFoundException();
    }

    public void setMaterial(String material) {
        throw new AddCropNotFoundException();
    }

    public int getRed() {
        throw new AddCropNotFoundException();
    }

    public void setRed(int red) {
        throw new AddCropNotFoundException();
    }

    public int getGreen() {
        throw new AddCropNotFoundException();
    }

    public void setGreen(int green) {
        throw new AddCropNotFoundException();
    }

    public int getBlue() {
        throw new AddCropNotFoundException();
    }

    public void setBlue(int blue) {
        throw new AddCropNotFoundException();
    }

    public double getSize() {
        throw new AddCropNotFoundException();
    }

    public void setSize(double size) {
        throw new AddCropNotFoundException();
    }
}