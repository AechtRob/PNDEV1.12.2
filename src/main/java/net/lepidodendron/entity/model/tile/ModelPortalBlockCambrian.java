package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockCambrian extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer lobopod;
    private final AdvancedModelRenderer legLR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legLR3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legLF;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legLF4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legLF3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legLF5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaR3;
    private final AdvancedModelRenderer sponge;
    private final AdvancedModelRenderer sponge2;
    private final AdvancedModelRenderer sponge3;
    private final AdvancedModelRenderer sponge4;
    private final AdvancedModelRenderer sponge5;
    private final AdvancedModelRenderer strom1;
    private final AdvancedModelRenderer strom2;
    private final AdvancedModelRenderer strom3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer strom4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer strom5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer strom6;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer strom7;
    private final AdvancedModelRenderer cube_r11;

    public ModelPortalBlockCambrian() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        lobopod = new AdvancedModelRenderer(this);
        lobopod.setRotationPoint(0.0F, 7.5167F, 1.8F);
        lobopod.cubeList.add(new ModelBox(lobopod, 8, 32, -0.5F, -0.5167F, -2.8F, 1, 1, 5, -0.1F, false));
        lobopod.cubeList.add(new ModelBox(lobopod, -1, 32, -1.0F, -0.0167F, -2.8F, 2, 0, 4, 0.0F, false));
        lobopod.cubeList.add(new ModelBox(lobopod, 19, 32, -0.5F, 0.0333F, -3.3F, 1, 0, 1, 0.0F, false));

        legLR = new AdvancedModelRenderer(this);
        legLR.setRotationPoint(-0.5F, 0.2333F, -2.3F);
        lobopod.addChild(legLR);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLR.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLR3 = new AdvancedModelRenderer(this);
        legLR3.setRotationPoint(-0.5F, 0.2333F, -2.3F);
        lobopod.addChild(legLR3);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
        legLR3.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.0F, 0.5672F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        legLF = new AdvancedModelRenderer(this);
        legLF.setRotationPoint(-0.5F, 0.2333F, -0.3F);
        lobopod.addChild(legLF);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLF.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.0F, -0.5672F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 32, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        legLF4 = new AdvancedModelRenderer(this);
        legLF4.setRotationPoint(-0.5F, 0.2333F, -0.3F);
        lobopod.addChild(legLF4);


        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
        legLF4.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5672F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 32, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        legLF3 = new AdvancedModelRenderer(this);
        legLF3.setRotationPoint(-0.5F, 0.2333F, -0.3F);
        lobopod.addChild(legLF3);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 1.0F);
        legLF3.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5672F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLF5 = new AdvancedModelRenderer(this);
        legLF5.setRotationPoint(-0.5F, 0.2333F, -0.3F);
        lobopod.addChild(legLF5);


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(1.0F, 0.0F, 1.0F);
        legLF5.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5672F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        antennaR = new AdvancedModelRenderer(this);
        antennaR.setRotationPoint(0.1F, -0.5167F, 2.125F);
        lobopod.addChild(antennaR);
        setRotateAngle(antennaR, 0.1745F, 0.3927F, 0.0F);
        antennaR.cubeList.add(new ModelBox(antennaR, 20, 34, -0.4F, -0.2F, -0.675F, 1, 1, 3, -0.6F, false));
        antennaR.cubeList.add(new ModelBox(antennaR, 21, 32, -0.6F, -0.2F, 0.675F, 1, 1, 1, -0.6F, false));

        antennaR3 = new AdvancedModelRenderer(this);
        antennaR3.setRotationPoint(-0.1F, -0.5167F, 2.125F);
        lobopod.addChild(antennaR3);
        setRotateAngle(antennaR3, 0.1745F, -0.3927F, 0.0F);
        antennaR3.cubeList.add(new ModelBox(antennaR3, 20, 34, -0.6F, -0.2F, -0.675F, 1, 1, 3, -0.6F, true));
        antennaR3.cubeList.add(new ModelBox(antennaR3, 21, 32, -0.4F, -0.2F, 0.675F, 1, 1, 1, -0.6F, true));

        sponge = new AdvancedModelRenderer(this);
        sponge.scaleChildren = true;
        sponge.setRotationPoint(-0.5F, 24.0F, -0.5F);
        sponge.cubeList.add(new ModelBox(sponge, 0, 39, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 41, 0.0F, -3.0F, -2.0F, 1, 3, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 45, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 6, 43, 1.0F, -4.0F, 1.0F, 1, 4, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 6, 40, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 10, 46, 0.0F, -1.05F, 0.0F, 2, 1, 1, 0.0F, false));

        sponge2 = new AdvancedModelRenderer(this);
        sponge2.scaleChildren = true;
        sponge2.setRotationPoint(0.5F, 24.0F, -0.5F);
        setRotateAngle(sponge2, 0.0F, -1.5708F, 0.0F);
        sponge2.cubeList.add(new ModelBox(sponge2, 16, 39, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 16, 41, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 16, 45, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 22, 43, 1.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 22, 40, 1.0F, -3.0F, 2.0F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 26, 40, -1.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 26, 43, 1.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 22, 46, -2.0F, -1.05F, 0.0F, 5, 1, 1, 0.0F, false));

        sponge3 = new AdvancedModelRenderer(this);
        sponge3.scaleChildren = true;
        sponge3.setRotationPoint(-0.5F, 24.0F, -3.0F);
        sponge3.cubeList.add(new ModelBox(sponge3, 40, 46, -2.0F, -1.05F, 2.5F, 5, 1, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 34, 39, 0.0F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 34, 41, -1.0F, -3.0F, 1.5F, 1, 3, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 34, 45, 0.0F, -1.0F, 2.5F, 1, 1, 2, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 40, 43, 1.0F, -2.0F, 3.5F, 1, 2, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 40, 40, 2.0F, -3.0F, 3.5F, 1, 2, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 44, 40, -1.0F, -2.0F, 4.5F, 1, 2, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 44, 43, 1.0F, -2.0F, 0.5F, 1, 2, 1, 0.0F, false));

        sponge4 = new AdvancedModelRenderer(this);
        sponge4.scaleChildren = true;
        sponge4.setRotationPoint(0.5F, 16.0F, -8.1F);
        sponge4.cubeList.add(new ModelBox(sponge4, 0, 52, -4.5F, -1.0F, -0.15F, 8, 8, 0, 0.0F, false));

        sponge5 = new AdvancedModelRenderer(this);
        sponge5.scaleChildren = true;
        sponge5.setRotationPoint(0.5F, 16.0F, -8.1F);
        sponge5.cubeList.add(new ModelBox(sponge5, 16, 52, -4.5F, -1.0F, -0.15F, 8, 8, 0, 0.0F, false));

        strom1 = new AdvancedModelRenderer(this);
        strom1.scaleChildren = true;
        strom1.setRotationPoint(6.0F, 8.0F, 3.0F);
        strom1.cubeList.add(new ModelBox(strom1, 48, 52, -2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F, false));
        strom1.cubeList.add(new ModelBox(strom1, 44, 58, -2.5F, -3.0F, -2.5F, 5, 1, 5, 0.0F, false));

        strom2 = new AdvancedModelRenderer(this);
        strom2.scaleChildren = true;
        strom2.setRotationPoint(-7.0F, 8.0F, -5.0F);
        setRotateAngle(strom2, 0.0F, 0.0F, -0.4363F);
        strom2.cubeList.add(new ModelBox(strom2, 48, 50, -2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));
        strom2.cubeList.add(new ModelBox(strom2, 44, 58, -2.5F, -3.0F, -2.5F, 5, 1, 5, 0.0F, false));

        strom3 = new AdvancedModelRenderer(this);
        strom3.scaleChildren = true;
        strom3.setRotationPoint(-4.0F, 9.0F, 7.0F);
        setRotateAngle(strom3, -0.6981F, 0.0F, 0.0F);
        strom3.cubeList.add(new ModelBox(strom3, 48, 51, -2.0F, -2.0F, -2.0F, 4, 3, 4, 0.0F, false));

        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(2.0F, -2.0F, -1.0F);
        strom3.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 58, -4.5F, -0.35F, -1.5F, 5, 1, 5, 0.0F, false));

        strom4 = new AdvancedModelRenderer(this);
        strom4.scaleChildren = true;
        strom4.setRotationPoint(6.0F, 17.0F, -5.0F);
        setRotateAngle(strom4, 0.0F, 0.0F, 0.7854F);
        strom4.cubeList.add(new ModelBox(strom4, 48, 48, -2.0F, -6.0F, -2.0F, 4, 6, 4, 0.0F, false));

        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(2.0F, -6.0F, -1.0F);
        strom4.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 58, -4.5F, -1.0F, -1.5F, 5, 1, 5, 0.0F, false));

        strom5 = new AdvancedModelRenderer(this);
        strom5.scaleChildren = true;
        strom5.setRotationPoint(-6.0F, 22.0F, 5.0F);
        setRotateAngle(strom5, 0.0F, 0.0F, -0.7854F);
        strom5.cubeList.add(new ModelBox(strom5, 48, 48, -2.0F, -6.0F, -2.0F, 4, 6, 4, 0.0F, true));

        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(-2.0F, -6.0F, -1.0F);
        strom5.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 58, -0.5F, -1.0F, -1.5F, 5, 1, 5, 0.0F, true));

        strom6 = new AdvancedModelRenderer(this);
        strom6.scaleChildren = true;
        strom6.setRotationPoint(1.0F, 11.0F, -9.0F);
        setRotateAngle(strom6, 0.6981F, 0.0F, 0.0F);
        strom6.cubeList.add(new ModelBox(strom6, 48, 48, -2.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F, false));

        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(2.0F, -2.0F, 1.0F);
        strom6.addChild(cube_r10);
        setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 58, -4.5F, -0.35F, -3.5F, 5, 1, 5, 0.0F, false));

        strom7 = new AdvancedModelRenderer(this);
        strom7.scaleChildren = true;
        strom7.setRotationPoint(0.0F, 16.0F, 9.0F);
        setRotateAngle(strom7, -0.6981F, 0.0F, 0.0F);
        strom7.cubeList.add(new ModelBox(strom7, 48, 48, -2.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F, false));

        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(2.0F, -2.0F, -1.0F);
        strom7.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 58, -4.5F, -0.35F, -1.5F, 5, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks, boolean up, boolean north, boolean east, boolean south, boolean west ) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
        if (up) {
            strom1.render(f);
        }
        if (up || east) {
            strom2.render(f);
        }
        if (up || south) {
            strom3.render(f);
        }
        if (west) {
            strom4.render(f);
        }
        if (east) {
            strom5.render(f);
        }
        if (north) {
            strom6.render(f);
        }
        if (south) {
            strom7.render(f);
        }
    }

    public void renderThing(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        lobopod.render(f);
    }

    public void renderSponge1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge.render(f);
    }

    public void renderSponge2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge2.render(f);
    }

    public void renderSponge3(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge3.render(f);
    }

    public void renderSideThing1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge4.render(f);
    }

    public void renderSideThing2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge5.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    public void animationCycle(double animTick, double partialTickTime) {
        int animCycle = 90 + 1;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
            yy = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
            zz = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
        }
        else if (tickAnim >= 10 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 10) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 80) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 80) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 80 + (((tickAnim - 0) / 11) * (80-(80)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 80 + (((tickAnim - 11) / 11) * (0-(80)));
            yy = 0 + (((tickAnim - 11) / 11) * (-75-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 22) / 16) * (0-(0)));
            yy = -75 + (((tickAnim - 22) / 16) * (-75-(-75)));
            zz = 0 + (((tickAnim - 22) / 16) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -75 + (((tickAnim - 38) / 4) * (-50-(-75)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -50 + (((tickAnim - 42) / 2) * (30-(-50)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 44) / 22) * (0-(0)));
            yy = 30 + (((tickAnim - 44) / 22) * (30-(30)));
            zz = 0 + (((tickAnim - 44) / 22) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            yy = 30 + (((tickAnim - 66) / 4) * (90 + 1-(30)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 70) / 8) * (-80-(0)));
            yy = 90 + 1 + (((tickAnim - 70) / 8) * (80-(90 + 1)));
            zz = 0 + (((tickAnim - 70) / 8) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -80 + (((tickAnim - 78) / 5) * (-80-(-80)));
            yy = 80 + (((tickAnim - 78) / 5) * (80-(80)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90 + 1) {
            xx = -80 + (((tickAnim - 83) / 7) * (-80-(-80)));
            yy = 80 + (((tickAnim - 83) / 7) * (80-(80)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lobopod, lobopod.rotateAngleX + (float) Math.toRadians(xx), lobopod.rotateAngleY + (float) Math.toRadians(yy), lobopod.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 17) * (0-(-5)));
            zz = -4.5 + (((tickAnim - 0) / 17) * (-4.2-(-4.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = -4.2 + (((tickAnim - 17) / 5) * (-3.2-(-4.2)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 22) / 23) * (-6-(0)));
            yy = 0 + (((tickAnim - 22) / 23) * (0-(0)));
            zz = -3.2 + (((tickAnim - 22) / 23) * (-1.81-(-3.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 68) {
            xx = -6 + (((tickAnim - 45) / 23) * (-3.28-(-6)));
            yy = 0 + (((tickAnim - 45) / 23) * (0-(0)));
            zz = -1.81 + (((tickAnim - 45) / 23) * (3.26-(-1.81)));
        }
        else if (tickAnim >= 68 && tickAnim < 74) {
            xx = -3.28 + (((tickAnim - 68) / 6) * (0.25-(-3.28)));
            yy = 0 + (((tickAnim - 68) / 6) * (0-(0)));
            zz = 3.26 + (((tickAnim - 68) / 6) * (2.5-(3.26)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0.25 + (((tickAnim - 74) / 9) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 74) / 9) * (-5-(0)));
            zz = 2.5 + (((tickAnim - 74) / 9) * (2.5-(2.5)));
        }
        else if (tickAnim >= 83 && tickAnim < 90 + 1) {
            xx = 0.25 + (((tickAnim - 83) / 7) * (0.25-(0.25)));
            yy = -5 + (((tickAnim - 83) / 7) * (-5-(-5)));
            zz = 2.5 + (((tickAnim - 83) / 7) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lobopod.rotationPointX = this.lobopod.rotationPointX + (float)(xx);
        this.lobopod.rotationPointY = this.lobopod.rotationPointY - (float)(yy);
        this.lobopod.rotationPointZ = this.lobopod.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            yy = 16 + (((tickAnim - 0) / 90 + 1) * (16-(16)));
            zz = -3.5 + (((tickAnim - 0) / 90 + 1) * (-3.5-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge.rotationPointX = this.sponge.rotationPointX + (float)(xx);
        this.sponge.rotationPointY = this.sponge.rotationPointY - (float)(yy);
        this.sponge.rotationPointZ = this.sponge.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (1-(0)));
            yy = 0 + (((tickAnim - 27) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 27) / 14) * (1-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 41) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 41) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 41) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0.97 + (((tickAnim - 48) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 48) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 48) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 56 && tickAnim < 64) {
            xx = 1 + (((tickAnim - 56) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 56) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 56) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 0.97 + (((tickAnim - 64) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 64) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 64) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 72 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 72) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 72) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 72) / 18) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            yy = 16 + (((tickAnim - 0) / 90 + 1) * (16-(16)));
            zz = -3.5 + (((tickAnim - 0) / 90 + 1) * (-3.5-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge2.rotationPointX = this.sponge2.rotationPointX + (float)(xx);
        this.sponge2.rotationPointY = this.sponge2.rotationPointY - (float)(yy);
        this.sponge2.rotationPointZ = this.sponge2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (1-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 43) / 5) * (0.97-(1)));
            yy = 1 + (((tickAnim - 43) / 5) * (0.97-(1)));
            zz = 1 + (((tickAnim - 43) / 5) * (0.97-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 54) / 6) * (0.97-(1)));
            yy = 1 + (((tickAnim - 54) / 6) * (0.97-(1)));
            zz = 1 + (((tickAnim - 54) / 6) * (0.97-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0.97 + (((tickAnim - 60) / 5) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 60) / 5) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 60) / 5) * (1-(0.97)));
        }
        else if (tickAnim >= 65 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 65) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 65) / 25) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            yy = 16 + (((tickAnim - 0) / 90 + 1) * (16-(16)));
            zz = -4 + (((tickAnim - 0) / 90 + 1) * (-4-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge3.rotationPointX = this.sponge3.rotationPointX + (float)(xx);
        this.sponge3.rotationPointY = this.sponge3.rotationPointY - (float)(yy);
        this.sponge3.rotationPointZ = this.sponge3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 38) / 13) * (1-(0)));
            yy = 0 + (((tickAnim - 38) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 38) / 13) * (1-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 51) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 51) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 51) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0.97 + (((tickAnim - 58) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 58) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 58) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 1 + (((tickAnim - 66) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 66) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 66) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = 0.97 + (((tickAnim - 74) / 7) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 74) / 7) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 74) / 7) * (1-(0.97)));
        }
        else if (tickAnim >= 81 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 81) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 81) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 81) / 9) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge4.rotationPointX = this.sponge4.rotationPointX + (float)(xx);
        this.sponge4.rotationPointY = this.sponge4.rotationPointY - (float)(yy);
        this.sponge4.rotationPointZ = this.sponge4.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (1-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (1-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = 0.97 + (((tickAnim - 48) / 9) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 48) / 9) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 48) / 9) * (1-(0.97)));
        }
        else if (tickAnim >= 57 && tickAnim < 67) {
            xx = 1 + (((tickAnim - 57) / 10) * (0.97-(1)));
            yy = 1 + (((tickAnim - 57) / 10) * (0.97-(1)));
            zz = 1 + (((tickAnim - 57) / 10) * (0.97-(1)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 0.97 + (((tickAnim - 67) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 67) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 67) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 75 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 75) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 15) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90 + 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge5.rotationPointX = this.sponge5.rotationPointX + (float)(xx);
        this.sponge5.rotationPointY = this.sponge5.rotationPointY - (float)(yy);
        this.sponge5.rotationPointZ = this.sponge5.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 36) / 11) * (1-(0)));
            yy = 0 + (((tickAnim - 36) / 11) * (1-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (1-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = 0.97 + (((tickAnim - 54) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 54) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 54) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 62) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 62) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 0.97 + (((tickAnim - 70) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 70) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 70) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 78 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 78) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 78) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 78) / 12) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 25) / 65) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 65) * (1-(1)));
            zz = 1 + (((tickAnim - 25) / 65) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 55) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 13) / 26) * (1-(0)));
            yy = 0 + (((tickAnim - 13) / 26) * (1-(0)));
            zz = 0 + (((tickAnim - 13) / 26) * (1-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 39) / 51) * (1-(1)));
            yy = 1 + (((tickAnim - 39) / 51) * (1-(1)));
            zz = 1 + (((tickAnim - 39) / 51) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (1-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 37) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 37) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 37) / 53) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 55) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 55) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 55) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (1-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 22) / 68) * (1-(1)));
            yy = 1 + (((tickAnim - 22) / 68) * (1-(1)));
            zz = 1 + (((tickAnim - 22) / 68) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.strom7.setScale((float)xx, (float)yy, (float)zz);


    }
}
