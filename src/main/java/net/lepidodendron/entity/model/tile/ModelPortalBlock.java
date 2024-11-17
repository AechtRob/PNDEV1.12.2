package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlock extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer leaves3b;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leaves3a;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer leaves4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer leaves5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer leaves6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer leaves7;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer bone8;

    public ModelPortalBlock() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        base = new AdvancedModelRenderer(this);
        base.setRotationPoint(0.0F, 14.0F, -4.0F);
        base.cubeList.add(new ModelBox(base, 8, 32, -1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F, false));

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, -2.5F, 0.0F);
        base.addChild(bone);
        base.scaleChildren = true;
        bone.cubeList.add(new ModelBox(bone, 24, 32, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.01F, false));

        bone2 = new AdvancedModelRenderer(this);
        bone2.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone.addChild(bone2);
        bone.scaleChildren = true;
        bone2.cubeList.add(new ModelBox(bone2, 16, 32, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.1F, false));

        bone3 = new AdvancedModelRenderer(this);
        bone3.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone2.addChild(bone3);
        bone2.scaleChildren = true;
        bone3.cubeList.add(new ModelBox(bone3, 32, 32, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.11F, false));

        leaves3b = new AdvancedModelRenderer(this);
        leaves3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(leaves3b);
        bone3.scaleChildren = true;


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
        leaves3b.addChild(cube_r1);
        leaves3b.scaleChildren = true;
        setRotateAngle(cube_r1, 0.0F, -1.2217F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 52, -6.5F, -2.5F, 0.0F, 13, 5, 0, 0.0F, false));

        leaves3a = new AdvancedModelRenderer(this);
        leaves3a.setRotationPoint(0.0F, 2.0F, 0.0F);
        bone3.addChild(leaves3a);
        bone3.scaleChildren = true;


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaves3a.addChild(cube_r2);
        leaves3a.scaleChildren = true;
        setRotateAngle(cube_r2, 0.0F, 1.2217F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 52, -6.5F, -2.5F, 0.0F, 13, 5, 0, 0.0F, false));

        bone4 = new AdvancedModelRenderer(this);
        bone4.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone3.addChild(bone4);
        bone3.scaleChildren = true;
        bone4.cubeList.add(new ModelBox(bone4, 8, 37, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.2F, false));

        leaves4 = new AdvancedModelRenderer(this);
        leaves4.setRotationPoint(0.0F, 0.5F, 0.0F);
        bone4.addChild(leaves4);
        bone4.scaleChildren = true;


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaves4.addChild(cube_r3);
        leaves4.scaleChildren = true;
        setRotateAngle(cube_r3, 0.0F, 1.3963F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 49, -3.5F, -1.5F, 0.0F, 7, 3, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaves4.addChild(cube_r4);
        leaves4.scaleChildren = true;
        setRotateAngle(cube_r4, 0.0F, -1.3963F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 49, -3.5F, -1.5F, 0.0F, 7, 3, 0, 0.0F, false));

        bone5 = new AdvancedModelRenderer(this);
        bone5.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone4.addChild(bone5);
        bone4.scaleChildren = true;
        bone5.cubeList.add(new ModelBox(bone5, 16, 37, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.21F, false));

        leaves5 = new AdvancedModelRenderer(this);
        leaves5.setRotationPoint(0.0F, -0.5F, 0.0F);
        bone5.addChild(leaves5);
        bone5.scaleChildren = true;


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaves5.addChild(cube_r5);
        leaves5.scaleChildren = true;
        setRotateAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, -2.5F, -1.5F, 0.0F, 5, 3, 0, 0.0F, false));

        bone6 = new AdvancedModelRenderer(this);
        bone6.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone5.addChild(bone6);
        bone5.scaleChildren = true;
        bone6.cubeList.add(new ModelBox(bone6, 24, 37, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.3F, false));

        leaves6 = new AdvancedModelRenderer(this);
        leaves6.setRotationPoint(0.0F, -0.5F, 0.0F);
        bone6.addChild(leaves6);
        bone6.scaleChildren = true;


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaves6.addChild(cube_r6);
        leaves6.scaleChildren = true;
        setRotateAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 43, -2.0F, -1.5F, 0.0F, 4, 3, 0, 0.0F, false));

        bone7 = new AdvancedModelRenderer(this);
        bone7.setRotationPoint(0.0F, -2.0F, 0.0F);
        bone6.addChild(bone7);
        bone6.scaleChildren = true;
        bone7.cubeList.add(new ModelBox(bone7, 32, 37, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.5F, false));

        leaves7 = new AdvancedModelRenderer(this);
        leaves7.setRotationPoint(0.0F, -1.0F, 0.0F);
        bone7.addChild(leaves7);
        bone7.scaleChildren = true;


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(-1.0F, -0.5F, -2.0F);
        leaves7.addChild(cube_r7);
        leaves7.scaleChildren = true;
        setRotateAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 43, 0.5F, -1.0F, -1.0F, 3, 3, 0, 0.0F, false));

        bone8 = new AdvancedModelRenderer(this);
        bone8.setRotationPoint(0.0F, -1.5F, 0.0F);
        bone7.addChild(bone8);
        bone7.scaleChildren = true;
        bone8.cubeList.add(new ModelBox(bone8, 0, 32, -1.0F, -3.5F, -1.0F, 2, 4, 2, -0.6F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderTentacle(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        base.render(f);
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

        if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (45-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 28) / 5) * (-22.5-(45)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 20 + (((tickAnim - 33) / 15) * (-12-(20)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = -22.5 + (((tickAnim - 33) / 15) * (0-(-22.5)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = -12 + (((tickAnim - 48) / 6) * (0-(-12)));
            yy = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 6) * (45-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 45 + (((tickAnim - 54) / 26) * (45-(45)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 80) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone5, bone5.rotateAngleX + (float) Math.toRadians(xx), bone5.rotateAngleY + (float) Math.toRadians(yy), bone5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (45-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 45 + (((tickAnim - 28) / 6) * (-22.5-(45)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = -22.5 + (((tickAnim - 34) / 11) * (0-(-22.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (45-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 45 + (((tickAnim - 60) / 20) * (45-(45)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 80) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone6, bone6.rotateAngleX + (float) Math.toRadians(xx), bone6.rotateAngleY + (float) Math.toRadians(yy), bone6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (45-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 45 + (((tickAnim - 26) / 7) * (-22.5-(45)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = -22.5 + (((tickAnim - 33) / 8) * (0-(-22.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 41) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 41) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 8) * (40-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = -20 + (((tickAnim - 49) / 7) * (-7.69-(-20)));
            yy = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            zz = 40 + (((tickAnim - 49) / 7) * (20.69-(40)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -7.69 + (((tickAnim - 56) / 4) * (0-(-7.69)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 20.69 + (((tickAnim - 56) / 4) * (20-(20.69)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 20 + (((tickAnim - 60) / 5) * (15-(20)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 15 + (((tickAnim - 65) / 5) * (20-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 20 + (((tickAnim - 70) / 10) * (20-(20)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 20 + (((tickAnim - 80) / 10) * (20-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone7, bone7.rotateAngleX + (float) Math.toRadians(xx), bone7.rotateAngleY + (float) Math.toRadians(yy), bone7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (20-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (35.36-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 22) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 35.36 + (((tickAnim - 22) / 2) * (45-(35.36)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 45 + (((tickAnim - 24) / 4) * (22.5-(45)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 28) / 9) * (0-(-10)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 22.5 + (((tickAnim - 28) / 9) * (-22.5-(22.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 37) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 12) * (0-(0)));
            zz = -22.5 + (((tickAnim - 37) / 12) * (33-(-22.5)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            zz = 33 + (((tickAnim - 49) / 6) * (-33-(33)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = -33 + (((tickAnim - 55) / 3) * (-40-(-33)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = -40 + (((tickAnim - 58) / 2) * (-33-(-40)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = -33 + (((tickAnim - 60) / 5) * (-36-(-33)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = -36 + (((tickAnim - 65) / 5) * (-33-(-36)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = -33 + (((tickAnim - 70) / 5) * (-33-(-33)));
        }
        else if (tickAnim >= 75 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = -33 + (((tickAnim - 75) / 15) * (-33-(-33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone8, bone8.rotateAngleX + (float) Math.toRadians(xx), bone8.rotateAngleY + (float) Math.toRadians(yy), bone8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (22.5-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 22.5 + (((tickAnim - 51) / 29) * (22.5-(22.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 22.5 + (((tickAnim - 80) / 10) * (22.5-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (4.66-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            yy = 4.66 + (((tickAnim - 51) / 29) * (4.66-(4.66)));
            zz = 0 + (((tickAnim - 51) / 29) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 4.66 + (((tickAnim - 80) / 10) * (4.66-(4.66)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (1.05-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (1.05-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 59) {
            xx = 1.05 + (((tickAnim - 37) / 22) * (1.05-(1.05)));
            yy = 1.05 + (((tickAnim - 37) / 22) * (1.05-(1.05)));
            zz = 1.05 + (((tickAnim - 37) / 22) * (1.05-(1.05)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 1.05 + (((tickAnim - 59) / 11) * (1-(1.05)));
            yy = 1.05 + (((tickAnim - 59) / 11) * (1-(1.05)));
            zz = 1.05 + (((tickAnim - 59) / 11) * (1-(1.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 29 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 29) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 12) * (45-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 41) / 10) * (52-(45)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 52 + (((tickAnim - 51) / 29) * (52-(52)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 52 + (((tickAnim - 80) / 10) * (52-(52)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (45-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (6-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 38) / 5) * (40.83-(45)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 6 + (((tickAnim - 43) / 6) * (-4-(6)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 40.83 + (((tickAnim - 43) / 6) * (34.17-(40.83)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -4 + (((tickAnim - 49) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 34.17 + (((tickAnim - 49) / 4) * (30-(34.17)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 30 + (((tickAnim - 53) / 27) * (30-(30)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 30 + (((tickAnim - 80) / 10) * (30-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone2, bone2.rotateAngleX + (float) Math.toRadians(xx), bone2.rotateAngleY + (float) Math.toRadians(yy), bone2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (45-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 10 + (((tickAnim - 33) / 12) * (-15-(10)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 45 + (((tickAnim - 33) / 12) * (-22.5-(45)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -15 + (((tickAnim - 45) / 8) * (15-(-15)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = -22.5 + (((tickAnim - 45) / 8) * (-10-(-22.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 15 + (((tickAnim - 53) / 3) * (9.38-(15)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 53) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 9.38 + (((tickAnim - 56) / 4) * (0-(9.38)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = -15 + (((tickAnim - 56) / 4) * (-10-(-15)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -10 + (((tickAnim - 60) / 20) * (-10-(-10)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = -10 + (((tickAnim - 80) / 10) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone3, bone3.rotateAngleX + (float) Math.toRadians(xx), bone3.rotateAngleY + (float) Math.toRadians(yy), bone3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (45-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 45 + (((tickAnim - 32) / 11) * (-33-(45)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = -33 + (((tickAnim - 43) / 11) * (10-(-33)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 10 + (((tickAnim - 54) / 26) * (10-(10)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 80) / 10) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone4, bone4.rotateAngleX + (float) Math.toRadians(xx), bone4.rotateAngleY + (float) Math.toRadians(yy), bone4.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 52) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 52) / 13) * (-20-(0)));
            zz = 0 + (((tickAnim - 52) / 13) * (10-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 65) / 15) * (0-(10)));
            yy = -20 + (((tickAnim - 65) / 15) * (0-(-20)));
            zz = 10 + (((tickAnim - 65) / 15) * (0-(10)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leaves3a, leaves3a.rotateAngleX + (float) Math.toRadians(xx), leaves3a.rotateAngleY + (float) Math.toRadians(yy), leaves3a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (1-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (1-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (1-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 58) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 58) / 22) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (1-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (1-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (1-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 53) / 16) * (1-(0)));
            yy = 0 + (((tickAnim - 53) / 16) * (1-(0)));
            zz = 0 + (((tickAnim - 53) / 16) * (1-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 69) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 69) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 69) / 11) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 58) / 15) * (1-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (1-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 73) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 73) / 7) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (1-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (1-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 52) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 52) / 13) * (20-(0)));
            zz = 0 + (((tickAnim - 52) / 13) * (10-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 65) / 15) * (0-(10)));
            yy = 20 + (((tickAnim - 65) / 15) * (0-(20)));
            zz = 10 + (((tickAnim - 65) / 15) * (0-(10)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leaves3b, leaves3b.rotateAngleX + (float) Math.toRadians(xx), leaves3b.rotateAngleY + (float) Math.toRadians(yy), leaves3b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (1-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (1-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (1-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 58) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 58) / 22) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leaves3b.setScale((float)xx, (float)yy, (float)zz);


    }

}
