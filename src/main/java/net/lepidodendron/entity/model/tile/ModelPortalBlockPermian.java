package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockPermian extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer deadBush1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer deadBush2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer droopingBranch;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer burnedBranch;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelPortalBlockPermian() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        deadBush1 = new AdvancedModelRenderer(this);
        deadBush1.scaleChildren = true;
        deadBush1.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -8.0F, 0.0F);
        deadBush1.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -8.0F, 0.0F);
        deadBush1.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, -2.3562F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        deadBush2 = new AdvancedModelRenderer(this);
        deadBush2.scaleChildren = true;
        deadBush2.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -8.0F, 0.0F);
        deadBush2.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 32, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -8.0F, 0.0F);
        deadBush2.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, -2.3562F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 32, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        droopingBranch = new AdvancedModelRenderer(this);
        droopingBranch.scaleChildren = true;
        droopingBranch.setRotationPoint(-8.0F, 12.0F, 0.0F);
        droopingBranch.cubeList.add(new ModelBox(droopingBranch, 0, 48, 0.0F, -4.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 4.0F, 0.0F);
        droopingBranch.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 48, 0.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 4.0F, 0.0F);
        droopingBranch.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, 0.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        burnedBranch = new AdvancedModelRenderer(this);
        burnedBranch.scaleChildren = true;
        burnedBranch.setRotationPoint(-8.0F, 23.5F, 0.0F);
        setRotateAngle(burnedBranch, 0.0F, -0.0873F, 0.0F);
        burnedBranch.cubeList.add(new ModelBox(burnedBranch, 32, 48, 0.0F, -15.5F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, -7.5F, 0.0F);
        burnedBranch.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 48, 0.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, -7.5F, 0.0F);
        burnedBranch.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 48, 0.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderDeadBush1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        deadBush1.render(f);
    }

    public void renderDeadBush2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        deadBush2.render(f);
    }

    public void renderDroopingBranch(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        droopingBranch.offsetY = droopingBranch.offsetY + 15F;
        droopingBranch.render(f);
    }

    public void renderBurnedBranch(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        burnedBranch.render(f);
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




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 16 + (((tickAnim - 0) / 80) * (16-(16)));
            zz = -4 + (((tickAnim - 0) / 80) * (-4-(-4)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 16 + (((tickAnim - 80) / 10) * (16-(16)));
            zz = -4 + (((tickAnim - 80) / 10) * (-4-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.deadBush1.rotationPointX = this.deadBush1.rotationPointX + (float)(xx);
        this.deadBush1.rotationPointY = this.deadBush1.rotationPointY - (float)(yy);
        this.deadBush1.rotationPointZ = this.deadBush1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 18) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 28) / 10) * (0.97-(1)));
            yy = 1 + (((tickAnim - 28) / 10) * (0.97-(1)));
            zz = 1 + (((tickAnim - 28) / 10) * (0.97-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0.97 + (((tickAnim - 38) / 10) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 38) / 10) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 38) / 10) * (1-(0.97)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 1 + (((tickAnim - 48) / 11) * (0.97-(1)));
            yy = 1 + (((tickAnim - 48) / 11) * (0.97-(1)));
            zz = 1 + (((tickAnim - 48) / 11) * (0.97-(1)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0.97 + (((tickAnim - 59) / 10) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 59) / 10) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 59) / 10) * (1-(0.97)));
        }
        else if (tickAnim >= 69 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 69) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 69) / 21) * (1-(1)));
            zz = 1 + (((tickAnim - 69) / 21) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.deadBush1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 16 + (((tickAnim - 0) / 80) * (16-(16)));
            zz = -4 + (((tickAnim - 0) / 80) * (-4-(-4)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 16 + (((tickAnim - 80) / 10) * (16-(16)));
            zz = -4 + (((tickAnim - 80) / 10) * (-4-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.deadBush2.rotationPointX = this.deadBush2.rotationPointX + (float)(xx);
        this.deadBush2.rotationPointY = this.deadBush2.rotationPointY - (float)(yy);
        this.deadBush2.rotationPointZ = this.deadBush2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (1-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 33) / 6) * (0.97-(1)));
            yy = 1 + (((tickAnim - 33) / 6) * (0.97-(1)));
            zz = 1 + (((tickAnim - 33) / 6) * (0.97-(1)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 0.97 + (((tickAnim - 39) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 39) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 39) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 47) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 0.97 + (((tickAnim - 54) / 7) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 54) / 7) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 54) / 7) * (1-(0.97)));
        }
        else if (tickAnim >= 61 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 61) / 29) * (1-(1)));
            yy = 1 + (((tickAnim - 61) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 61) / 29) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.deadBush2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            yy = 270 + (((tickAnim - 0) / 78) * (270-(270)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            yy = 270 + (((tickAnim - 78) / 12) * (270-(270)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(droopingBranch, droopingBranch.rotateAngleX + (float) Math.toRadians(xx), droopingBranch.rotateAngleY + (float) Math.toRadians(yy), droopingBranch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 12 + (((tickAnim - 0) / 78) * (12-(12)));
            yy = 6 + (((tickAnim - 0) / 78) * (6-(6)));
            zz = 8 + (((tickAnim - 0) / 78) * (8-(8)));
        }
        else if (tickAnim >= 78 && tickAnim < 90 + 1) {
            xx = 12 + (((tickAnim - 78) / 12) * (12-(12)));
            yy = 6 + (((tickAnim - 78) / 12) * (6-(6)));
            zz = 8 + (((tickAnim - 78) / 12) * (8-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.droopingBranch.rotationPointX = this.droopingBranch.rotationPointX + (float)(xx);
        this.droopingBranch.rotationPointY = this.droopingBranch.rotationPointY - (float)(yy);
        this.droopingBranch.rotationPointZ = this.droopingBranch.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (1-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 40) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 48) / 6) * (1-(0.97)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 54) / 9) * (0.97-(1)));
            yy = 1 + (((tickAnim - 54) / 9) * (0.97-(1)));
            zz = 1 + (((tickAnim - 54) / 9) * (0.97-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 0.97 + (((tickAnim - 63) / 8) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 63) / 8) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 63) / 8) * (1-(0.97)));
        }
        else if (tickAnim >= 71 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 71) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 71) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 71) / 19) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.droopingBranch.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            yy = 270 + (((tickAnim - 0) / 78) * (270-(270)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            yy = 270 + (((tickAnim - 78) / 12) * (270-(270)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(burnedBranch, burnedBranch.rotateAngleX + (float) Math.toRadians(xx), burnedBranch.rotateAngleY + (float) Math.toRadians(yy), burnedBranch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 12 + (((tickAnim - 0) / 78) * (12-(12)));
            yy = 7.5 + (((tickAnim - 0) / 78) * (7.5-(7.5)));
            zz = 8 + (((tickAnim - 0) / 78) * (8-(8)));
        }
        else if (tickAnim >= 78 && tickAnim < 90 + 1) {
            xx = 12 + (((tickAnim - 78) / 12) * (12-(12)));
            yy = 7.5 + (((tickAnim - 78) / 12) * (7.5-(7.5)));
            zz = 8 + (((tickAnim - 78) / 12) * (8-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.burnedBranch.rotationPointX = this.burnedBranch.rotationPointX + (float)(xx);
        this.burnedBranch.rotationPointY = this.burnedBranch.rotationPointY - (float)(yy);
        this.burnedBranch.rotationPointZ = this.burnedBranch.rotationPointZ + (float)(zz);


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
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0.97 + (((tickAnim - 58) / 5) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 58) / 5) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 58) / 5) * (1-(0.97)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 1 + (((tickAnim - 63) / 8) * (0.97-(1)));
            yy = 1 + (((tickAnim - 63) / 8) * (0.97-(1)));
            zz = 1 + (((tickAnim - 63) / 8) * (0.97-(1)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 0.97 + (((tickAnim - 71) / 7) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 71) / 7) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 71) / 7) * (1-(0.97)));
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
        this.burnedBranch.setScale((float)xx, (float)yy, (float)zz);


    }

}
