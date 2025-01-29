package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockJurassic extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer topplant1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer topplant2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer topplant3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer topplant4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer sideplant1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer sideplant2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer sideplant3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer sideplant4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer bone;

    public ModelPortalBlockJurassic() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        topplant1 = new AdvancedModelRenderer(this);
        topplant1.scaleChildren = true;
        topplant1.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant1.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant1.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, -2.3562F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        topplant2 = new AdvancedModelRenderer(this);
        topplant2.scaleChildren = true;
        topplant2.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant2.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 32, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant2.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, -2.3562F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 32, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        topplant3 = new AdvancedModelRenderer(this);
        topplant3.scaleChildren = true;
        topplant3.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant3.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 40, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant3.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, -2.3562F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        topplant4 = new AdvancedModelRenderer(this);
        topplant4.scaleChildren = true;
        topplant4.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant4.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 40, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, -8.0F, 0.0F);
        topplant4.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, -2.3562F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 40, -7.5F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        sideplant1 = new AdvancedModelRenderer(this);
        sideplant1.scaleChildren = true;
        sideplant1.setRotationPoint(-8.0F, 18.0F, 0.0F);
        sideplant1.cubeList.add(new ModelBox(sideplant1, 0, 48, 0.0F, -2.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, -2.0F, 0.0F);
        sideplant1.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 48, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, -2.0F, 0.0F);
        sideplant1.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 48, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        sideplant2 = new AdvancedModelRenderer(this);
        sideplant2.scaleChildren = true;
        sideplant2.setRotationPoint(-8.0F, 18.5F, 0.0F);
        setRotateAngle(sideplant2, 0.0F, -0.0873F, 0.0F);
        sideplant2.cubeList.add(new ModelBox(sideplant2, 32, 48, 0.0F, -2.5F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -2.5F, 0.0F);
        sideplant2.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 48, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r12 = new AdvancedModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, -2.5F, 0.0F);
        sideplant2.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 48, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        sideplant3 = new AdvancedModelRenderer(this);
        sideplant3.scaleChildren = true;
        sideplant3.setRotationPoint(-8.0F, 22.0F, 0.0F);
        sideplant3.cubeList.add(new ModelBox(sideplant3, 0, 56, 0.0F, -6.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r13 = new AdvancedModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, -6.0F, 0.0F);
        sideplant3.addChild(cube_r13);
        setRotateAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 56, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r14 = new AdvancedModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, -6.0F, 0.0F);
        sideplant3.addChild(cube_r14);
        setRotateAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 56, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        sideplant4 = new AdvancedModelRenderer(this);
        sideplant4.scaleChildren = true;
        sideplant4.setRotationPoint(-8.0F, 17.0F, 0.0F);
        setRotateAngle(sideplant4, 0.0F, -0.0873F, 0.0F);
        sideplant4.cubeList.add(new ModelBox(sideplant4, 32, 56, 0.0F, -1.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r15 = new AdvancedModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, -1.0F, 0.0F);
        sideplant4.addChild(cube_r15);
        setRotateAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 56, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        cube_r16 = new AdvancedModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, -1.0F, 0.0F);
        sideplant4.addChild(cube_r16);
        setRotateAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 56, 0.0F, 0.0F, 0.0F, 16, 8, 0, 0.0F, false));

        head1 = new AdvancedModelRenderer(this);
        head1.scaleChildren = true;
        head1.setRotationPoint(0.0F, 8.17F, -4.0F);
        head1.cubeList.add(new ModelBox(head1, 0, 0, -1.0F, -1.0F, -0.7F, 2, 2, 2, -0.8F, false));
        head1.cubeList.add(new ModelBox(head1, 0, 0, -1.0F, -1.0F, -1.3F, 2, 2, 2, -0.8F, false));

        head2 = new AdvancedModelRenderer(this);
        head2.scaleChildren = true;
        head2.setRotationPoint(0.1021F, 6.3368F, -4.0F);


        cube_r17 = new AdvancedModelRenderer(this);
        cube_r17.setRotationPoint(0.3979F, 0.6632F, 0.0F);
        head2.addChild(cube_r17);
        setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1309F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 11, -1.05F, -1.0F, -1.0F, 2, 2, 2, -0.01F, false));

        cube_r18 = new AdvancedModelRenderer(this);
        cube_r18.setRotationPoint(-0.1021F, -0.0868F, 0.0F);
        head2.addChild(cube_r18);
        setRotateAngle(cube_r18, 0.0F, 0.0F, 0.5672F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 4, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        cube_r19 = new AdvancedModelRenderer(this);
        cube_r19.setRotationPoint(-0.1021F, -0.3368F, -1.0F);
        head2.addChild(cube_r19);
        setRotateAngle(cube_r19, 1.5708F, -0.0436F, -1.1345F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 7, -1.05F, -0.5F, -1.0F, 2, 1, 2, -0.45F, false));

        cube_r20 = new AdvancedModelRenderer(this);
        cube_r20.setRotationPoint(-0.1021F, -0.3368F, 1.0F);
        head2.addChild(cube_r20);
        setRotateAngle(cube_r20, -1.5708F, 0.0436F, -1.1345F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 12, -1.05F, -0.5F, -1.0F, 2, 1, 2, -0.45F, false));

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.3367F, 1.1286F, 0.0F);
        head2.addChild(bone);
        setRotateAngle(bone, 0.0F, 0.0F, 0.4363F);
        bone.cubeList.add(new ModelBox(bone, 0, 8, -2.2387F, -0.5F, -1.0F, 3, 1, 2, -0.3F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderTopPlant1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        topplant1.render(f);
    }

    public void renderTopPlant2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        topplant2.render(f);
    }

    public void renderTopPlant3(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        topplant3.render(f);
    }

    public void renderTopPlant4(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        topplant4.render(f);
    }

    public void renderBranch1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sideplant1.offsetY = 6.0F;
        sideplant1.render(f);
    }

    public void renderBranch2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sideplant2.offsetY = 6.0F;
        sideplant2.render(f);
    }

    public void renderBranch3(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sideplant3.render(f);
    }

    public void renderBranch4(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sideplant4.offsetY = 8.0F;
        sideplant4.render(f);
    }
    
    public void renderEyes(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        head1.render(f);
    }

    public void renderHead(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        head2.render(f);
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
        this.topplant1.rotationPointX = this.topplant1.rotationPointX + (float)(xx);
        this.topplant1.rotationPointY = this.topplant1.rotationPointY - (float)(yy);
        this.topplant1.rotationPointZ = this.topplant1.rotationPointZ + (float)(zz);


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
        this.topplant1.setScale((float)xx, (float)yy, (float)zz);




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
        this.topplant2.rotationPointX = this.topplant2.rotationPointX + (float)(xx);
        this.topplant2.rotationPointY = this.topplant2.rotationPointY - (float)(yy);
        this.topplant2.rotationPointZ = this.topplant2.rotationPointZ + (float)(zz);


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
        this.topplant2.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(sideplant1, sideplant1.rotateAngleX + (float) Math.toRadians(xx), sideplant1.rotateAngleY + (float) Math.toRadians(yy), sideplant1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.sideplant1.rotationPointX = this.sideplant1.rotationPointX + (float)(xx);
        this.sideplant1.rotationPointY = this.sideplant1.rotationPointY - (float)(yy);
        this.sideplant1.rotationPointZ = this.sideplant1.rotationPointZ + (float)(zz);


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
        this.sideplant1.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(sideplant2, sideplant2.rotateAngleX + (float) Math.toRadians(xx), sideplant2.rotateAngleY + (float) Math.toRadians(yy), sideplant2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.sideplant2.rotationPointX = this.sideplant2.rotationPointX + (float)(xx);
        this.sideplant2.rotationPointY = this.sideplant2.rotationPointY - (float)(yy);
        this.sideplant2.rotationPointZ = this.sideplant2.rotationPointZ + (float)(zz);


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
        this.sideplant2.setScale((float)xx, (float)yy, (float)zz);


        //extraplants
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
        this.topplant3.rotationPointX = this.topplant3.rotationPointX + (float)(xx);
        this.topplant3.rotationPointY = this.topplant3.rotationPointY - (float)(yy);
        this.topplant3.rotationPointZ = this.topplant3.rotationPointZ + (float)(zz);


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
        this.topplant3.setScale((float)xx, (float)yy, (float)zz);



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
        this.topplant4.rotationPointX = this.topplant4.rotationPointX + (float)(xx);
        this.topplant4.rotationPointY = this.topplant4.rotationPointY - (float)(yy);
        this.topplant4.rotationPointZ = this.topplant4.rotationPointZ + (float)(zz);


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
        this.topplant4.setScale((float)xx, (float)yy, (float)zz);





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
        this.setRotateAngle(sideplant3, sideplant3.rotateAngleX + (float) Math.toRadians(xx), sideplant3.rotateAngleY + (float) Math.toRadians(yy), sideplant3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.sideplant3.rotationPointX = this.sideplant3.rotationPointX + (float)(xx);
        this.sideplant3.rotationPointY = this.sideplant3.rotationPointY - (float)(yy);
        this.sideplant3.rotationPointZ = this.sideplant3.rotationPointZ + (float)(zz);


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
        this.sideplant3.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(sideplant4, sideplant4.rotateAngleX + (float) Math.toRadians(xx), sideplant4.rotateAngleY + (float) Math.toRadians(yy), sideplant4.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.sideplant4.rotationPointX = this.sideplant4.rotationPointX + (float)(xx);
        this.sideplant4.rotationPointY = this.sideplant4.rotationPointY - (float)(yy);
        this.sideplant4.rotationPointZ = this.sideplant4.rotationPointZ + (float)(zz);


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
        this.sideplant4.setScale((float)xx, (float)yy, (float)zz);


        //Heads and eyes:
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (1-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (1-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 50) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 13) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 63) / 5) * (0-(1)));
            yy = 1 + (((tickAnim - 63) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 63) / 5) * (0-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (1-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 73) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 73) / 7) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 80) / 5) * (0-(1)));
            yy = 1 + (((tickAnim - 80) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 80) / 5) * (0-(1)));
        }
        else if (tickAnim >= 85 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (5-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 5 + (((tickAnim - 50) / 5) * (6-(5)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            yy = 6 + (((tickAnim - 55) / 7) * (8-(6)));
            zz = 0 + (((tickAnim - 55) / 7) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 62) / 4) * (0-(0)));
            yy = 8 + (((tickAnim - 62) / 4) * (-8-(8)));
            zz = 0 + (((tickAnim - 62) / 4) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            yy = -8 + (((tickAnim - 66) / 7) * (-6-(-8)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -6 + (((tickAnim - 73) / 4) * (10-(-6)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 77) / 13) * (0-(0)));
            yy = 10 + (((tickAnim - 77) / 13) * (0-(10)));
            zz = 0 + (((tickAnim - 77) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -0.4 + (((tickAnim - 0) / 28) * (-0.4-(-0.4)));
            yy = -3 + (((tickAnim - 0) / 28) * (-3-(-3)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -0.4 + (((tickAnim - 28) / 22) * (-0.4-(-0.4)));
            yy = -3 + (((tickAnim - 28) / 22) * (-0.6-(-3)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 76) {
            xx = -0.4 + (((tickAnim - 50) / 26) * (-0.4-(-0.4)));
            yy = -0.6 + (((tickAnim - 50) / 26) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 50) / 26) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 85) {
            xx = -0.4 + (((tickAnim - 76) / 9) * (-0.4-(-0.4)));
            yy = -0.6 + (((tickAnim - 76) / 9) * (-3-(-0.6)));
            zz = 0 + (((tickAnim - 76) / 9) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 90 + 1) {
            xx = -0.4 + (((tickAnim - 85) / 5) * (-0.4-(-0.4)));
            yy = -3 + (((tickAnim - 85) / 5) * (-3-(-3)));
            zz = 0 + (((tickAnim - 85) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head2.rotationPointX = this.head2.rotationPointX + (float)(xx);
        this.head2.rotationPointY = this.head2.rotationPointY - (float)(yy);
        this.head2.rotationPointZ = this.head2.rotationPointZ + (float)(zz);


        xx = 0.75;
        yy = 0.75;
        zz = 0.75;
        this.head2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (-20-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            zz = -20 + (((tickAnim - 50) / 2) * (0-(-20)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 52) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 6) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (-20-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 2) * (0-(0)));
            zz = -20 + (((tickAnim - 60) / 2) * (0-(-20)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 1) * (-20-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 63) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 1) * (0-(0)));
            zz = -20 + (((tickAnim - 63) / 1) * (0-(-20)));
        }
        else if (tickAnim >= 64 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 64) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 2) * (-20-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            zz = -20 + (((tickAnim - 66) / 2) * (0-(-20)));
        }
        else if (tickAnim >= 68 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 68) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));

    }

}
