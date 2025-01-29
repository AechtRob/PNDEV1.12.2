package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockTriassic extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer lizard;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legLR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legLF;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legRR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legRF;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lizard2;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer legLR2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legLF2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legRR2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legRF2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer branch2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pleuromeia1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pleuromeia2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer branch1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelPortalBlockTriassic() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        lizard = new AdvancedModelRenderer(this);
        lizard.setRotationPoint(0.0F, 7.3333F, 0.5F);
        lizard.cubeList.add(new ModelBox(lizard, 10, 32, -0.5F, -0.3333F, -1.5F, 1, 1, 3, 0.0F, false));
        lizard.cubeList.add(new ModelBox(lizard, 25, 32, -0.5F, -0.3333F, -2.0F, 1, 1, 1, -0.05F, false));
        lizard.cubeList.add(new ModelBox(lizard, 25, 32, -0.5F, -0.3333F, -2.75F, 1, 1, 1, -0.1F, false));

        tail1 = new AdvancedModelRenderer(this);
        tail1.setRotationPoint(0.0F, 0.1667F, -2.6F);
        lizard.addChild(tail1);
        tail1.cubeList.add(new ModelBox(tail1, 25, 32, -0.5F, -0.5F, -0.7F, 1, 1, 1, -0.2F, false));

        tail2 = new AdvancedModelRenderer(this);
        tail2.setRotationPoint(0.0F, 0.0F, -0.4F);
        tail1.addChild(tail2);
        tail2.cubeList.add(new ModelBox(tail2, 30, 32, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.3F, false));

        tail3 = new AdvancedModelRenderer(this);
        tail3.setRotationPoint(0.0F, 0.0F, -1.2F);
        tail2.addChild(tail3);
        tail3.cubeList.add(new ModelBox(tail3, 34, 32, -0.5F, -0.5F, -2.6F, 1, 1, 3, -0.325F, false));

        legLR = new AdvancedModelRenderer(this);
        legLR.setRotationPoint(-0.5F, 0.4167F, -1.0F);
        lizard.addChild(legLR);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLR.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLF = new AdvancedModelRenderer(this);
        legLF.setRotationPoint(-0.5F, 0.4167F, 1.0F);
        lizard.addChild(legLF);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLF.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.0F, -0.5672F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legRR = new AdvancedModelRenderer(this);
        legRR.setRotationPoint(0.5F, 0.4167F, -1.0F);
        lizard.addChild(legRR);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRR.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.0F, 0.5672F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        legRF = new AdvancedModelRenderer(this);
        legRF.setRotationPoint(0.5F, 0.4167F, 1.0F);
        lizard.addChild(legRF);


        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRF.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5672F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        head = new AdvancedModelRenderer(this);
        head.setRotationPoint(-0.3772F, -0.3333F, 1.5F);
        lizard.addChild(head);
        head.cubeList.add(new ModelBox(head, 6, 32, -0.1228F, -0.25F, -0.1735F, 1, 1, 1, -0.1F, true));
        head.cubeList.add(new ModelBox(head, 5, 34, 0.2272F, -0.5F, -0.1735F, 1, 1, 1, -0.4F, true));
        head.cubeList.add(new ModelBox(head, 5, 34, -0.4728F, -0.5F, -0.1735F, 1, 1, 1, -0.4F, false));

        lizard2 = new AdvancedModelRenderer(this);
        lizard2.setRotationPoint(0.0F, 7.3333F, 0.5F);
        lizard2.cubeList.add(new ModelBox(lizard2, 10, 32, -0.5F, -0.3333F, -1.5F, 1, 1, 3, 0.0F, false));
        lizard2.cubeList.add(new ModelBox(lizard2, 25, 32, -0.5F, -0.3333F, -2.0F, 1, 1, 1, -0.05F, false));
        lizard2.cubeList.add(new ModelBox(lizard2, 25, 32, -0.5F, -0.3333F, -2.75F, 1, 1, 1, -0.1F, false));

        tail4 = new AdvancedModelRenderer(this);
        tail4.setRotationPoint(0.0F, 0.1667F, -2.6F);
        lizard2.addChild(tail4);
        tail4.cubeList.add(new ModelBox(tail4, 25, 32, -0.5F, -0.5F, -0.7F, 1, 1, 1, -0.2F, false));

        tail5 = new AdvancedModelRenderer(this);
        tail5.setRotationPoint(0.0F, 0.0F, -0.4F);
        tail4.addChild(tail5);
        tail5.cubeList.add(new ModelBox(tail5, 30, 32, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.3F, false));

        tail6 = new AdvancedModelRenderer(this);
        tail6.setRotationPoint(0.0F, 0.0F, -1.2F);
        tail5.addChild(tail6);
        tail6.cubeList.add(new ModelBox(tail6, 34, 32, -0.5F, -0.5F, -2.6F, 1, 1, 3, -0.325F, false));

        legLR2 = new AdvancedModelRenderer(this);
        legLR2.setRotationPoint(-0.5F, 0.4167F, -1.0F);
        lizard2.addChild(legLR2);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLR2.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5672F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLF2 = new AdvancedModelRenderer(this);
        legLF2.setRotationPoint(-0.5F, 0.4167F, 1.0F);
        lizard2.addChild(legLF2);


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLF2.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, 0.0F, -0.5672F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legRR2 = new AdvancedModelRenderer(this);
        legRR2.setRotationPoint(0.5F, 0.4167F, -1.0F);
        lizard2.addChild(legRR2);


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRR2.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.0F, 0.5672F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        legRF2 = new AdvancedModelRenderer(this);
        legRF2.setRotationPoint(0.5F, 0.4167F, 1.0F);
        lizard2.addChild(legRF2);


        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRF2.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, 0.0F, 0.5672F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        head2 = new AdvancedModelRenderer(this);
        head2.setRotationPoint(-0.3772F, -0.3333F, 1.5F);
        lizard2.addChild(head2);
        head2.cubeList.add(new ModelBox(head2, 6, 32, -0.1228F, -0.25F, -0.1735F, 1, 1, 1, -0.1F, true));
        head2.cubeList.add(new ModelBox(head2, 5, 34, 0.2272F, -0.5F, -0.1735F, 1, 1, 1, -0.4F, true));
        head2.cubeList.add(new ModelBox(head2, 5, 34, -0.4728F, -0.5F, -0.1735F, 1, 1, 1, -0.4F, false));

        branch2 = new AdvancedModelRenderer(this);
        branch2.scaleChildren = true;
        branch2.setRotationPoint(-8.0F, 23.5F, 0.0F);
        setRotateAngle(branch2, 0.0F, -0.0873F, 0.0F);
        branch2.cubeList.add(new ModelBox(branch2, 32, 52, 0.0F, -11.5F, 0.0F, 16, 12, 0, 0.0F, false));

        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, -7.5F, 0.0F);
        branch2.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 52, 0.0F, -4.0F, 0.0F, 16, 12, 0, 0.0F, false));

        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, -7.5F, 0.0F);
        branch2.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 52, 0.0F, -4.0F, 0.0F, 16, 12, 0, 0.0F, false));

        pleuromeia1 = new AdvancedModelRenderer(this);
        pleuromeia1.scaleChildren = true;
        pleuromeia1.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -8.0F, 0.0F);
        pleuromeia1.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r12 = new AdvancedModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, -8.0F, 0.0F);
        pleuromeia1.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.0F, -2.3562F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        pleuromeia2 = new AdvancedModelRenderer(this);
        pleuromeia2.scaleChildren = true;
        pleuromeia2.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r13 = new AdvancedModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, -8.0F, 0.0F);
        pleuromeia2.addChild(cube_r13);
        setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 36, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r14 = new AdvancedModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, -8.0F, 0.0F);
        pleuromeia2.addChild(cube_r14);
        setRotateAngle(cube_r14, 0.0F, -2.3562F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 36, -7.5F, -8.0F, 0.0F, 16, 16, 0, 0.0F, false));

        branch1 = new AdvancedModelRenderer(this);
        branch1.scaleChildren = true;
        branch1.setRotationPoint(-8.0F, 22.0F, 0.0F);
        branch1.cubeList.add(new ModelBox(branch1, 0, 52, 0.0F, -10.0F, 0.0F, 16, 12, 0, 0.0F, false));

        cube_r15 = new AdvancedModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, -6.0F, 0.0F);
        branch1.addChild(cube_r15);
        setRotateAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 52, 0.0F, -4.0F, 0.0F, 16, 12, 0, 0.0F, false));

        cube_r16 = new AdvancedModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, -6.0F, 0.0F);
        branch1.addChild(cube_r16);
        setRotateAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 52, 0.0F, -4.0F, 0.0F, 16, 12, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderPleuromeia1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        pleuromeia1.render(f);
    }

    public void renderPleuromeia2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        pleuromeia2.render(f);
    }

    public void renderBranch1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        branch1.render(f);
    }

    public void renderBranch2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        branch2.offsetY = 1.0F;
        branch2.render(f);
    }



    public void renderLizard1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        lizard.render(f);
    }

    public void renderLizard2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        this.legLF.flap(1.0F, 0.2F, false, 0, 1.0F, f2, 1.0F);

        lizard2.render(f);
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
        this.pleuromeia1.rotationPointX = this.pleuromeia1.rotationPointX + (float)(xx);
        this.pleuromeia1.rotationPointY = this.pleuromeia1.rotationPointY - (float)(yy);
        this.pleuromeia1.rotationPointZ = this.pleuromeia1.rotationPointZ + (float)(zz);


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
        this.pleuromeia1.setScale((float)xx, (float)yy, (float)zz);




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
        this.pleuromeia2.rotationPointX = this.pleuromeia2.rotationPointX + (float)(xx);
        this.pleuromeia2.rotationPointY = this.pleuromeia2.rotationPointY - (float)(yy);
        this.pleuromeia2.rotationPointZ = this.pleuromeia2.rotationPointZ + (float)(zz);


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
        this.pleuromeia2.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(branch1, branch1.rotateAngleX + (float) Math.toRadians(xx), branch1.rotateAngleY + (float) Math.toRadians(yy), branch1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.branch1.rotationPointX = this.branch1.rotationPointX + (float)(xx);
        this.branch1.rotationPointY = this.branch1.rotationPointY - (float)(yy);
        this.branch1.rotationPointZ = this.branch1.rotationPointZ + (float)(zz);


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
        this.branch1.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(branch2, branch2.rotateAngleX + (float) Math.toRadians(xx), branch2.rotateAngleY + (float) Math.toRadians(yy), branch2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.branch2.rotationPointX = this.branch2.rotationPointX + (float)(xx);
        this.branch2.rotationPointY = this.branch2.rotationPointY - (float)(yy);
        this.branch2.rotationPointZ = this.branch2.rotationPointZ + (float)(zz);


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
        this.branch2.setScale((float)xx, (float)yy, (float)zz);

        //Lizards:

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 80 + (((tickAnim - 0) / 11) * (80-(80)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 80 + (((tickAnim - 11) / 8) * (10-(80)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 19) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 19) / 3) * (-65-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = -65 + (((tickAnim - 22) / 6) * (-50.87-(-65)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            yy = -50.87 + (((tickAnim - 28) / 13) * (50-(-50.87)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = 50 + (((tickAnim - 41) / 1) * (100-(50)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 100 + (((tickAnim - 42) / 6) * (110-(100)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 48) / 4) * (-0.00011-(0)));
            yy = 110 + (((tickAnim - 48) / 4) * (-58.26-(110)));
            zz = 0 + (((tickAnim - 48) / 4) * (0.00005-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = -0.00011 + (((tickAnim - 52) / 6) * (0-(-0.00011)));
            yy = -58.26 + (((tickAnim - 52) / 6) * (-58.26-(-58.26)));
            zz = 0.00005 + (((tickAnim - 52) / 6) * (0-(0.00005)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = -58.26 + (((tickAnim - 58) / 2) * (90-(-58.26)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (-80-(0)));
            yy = 90 + (((tickAnim - 60) / 8) * (80-(90)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -80 + (((tickAnim - 68) / 12) * (-80-(-80)));
            yy = 80 + (((tickAnim - 68) / 12) * (80-(80)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = -80 + (((tickAnim - 80) / 10) * (-80-(-80)));
            yy = 80 + (((tickAnim - 80) / 10) * (80-(80)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lizard, lizard.rotateAngleX + (float) Math.toRadians(xx), lizard.rotateAngleY + (float) Math.toRadians(yy), lizard.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 17) * (0-(-5)));
            zz = -4.5 + (((tickAnim - 0) / 17) * (-4.2-(-4.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (-1-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = -4.2 + (((tickAnim - 17) / 4) * (-2.37-(-4.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -1 + (((tickAnim - 21) / 10) * (-4-(-1)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = -2.37 + (((tickAnim - 21) / 10) * (-1.36-(-2.37)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 31) / 9) * (-3.9-(-4)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = -1.36 + (((tickAnim - 31) / 9) * (0.98-(-1.36)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -3.9 + (((tickAnim - 40) / 8) * (1.72-(-3.9)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0.98 + (((tickAnim - 40) / 8) * (-1.81-(0.98)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 1.72 + (((tickAnim - 48) / 10) * (-3.28-(1.72)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = -1.81 + (((tickAnim - 48) / 10) * (3.26-(-1.81)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = -3.28 + (((tickAnim - 58) / 6) * (0-(-3.28)));
            yy = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            zz = 3.26 + (((tickAnim - 58) / 6) * (3.5-(3.26)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 16) * (-5-(0)));
            zz = 3.5 + (((tickAnim - 64) / 16) * (4-(3.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = -5 + (((tickAnim - 80) / 10) * (-8-(-5)));
            zz = 4 + (((tickAnim - 80) / 10) * (4-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lizard.rotationPointX = this.lizard.rotationPointX + (float)(xx);
        this.lizard.rotationPointY = this.lizard.rotationPointY - (float)(yy);
        this.lizard.rotationPointZ = this.lizard.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 80 + (((tickAnim - 0) / 18) * (80-(80)));
            yy = 90 + (((tickAnim - 0) / 18) * (90-(90)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 80 + (((tickAnim - 18) / 8) * (10-(80)));
            yy = 90 + (((tickAnim - 18) / 8) * (90-(90)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 26) / 2) * (10-(10)));
            yy = 90 + (((tickAnim - 26) / 2) * (105-(90)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 10 + (((tickAnim - 28) / 6) * (0-(10)));
            yy = 105 + (((tickAnim - 28) / 6) * (100-(105)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 100 + (((tickAnim - 34) / 4) * (40-(100)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 40 + (((tickAnim - 38) / 2) * (5-(40)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 5 + (((tickAnim - 40) / 7) * (-8-(5)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = -8 + (((tickAnim - 47) / 6) * (-15-(-8)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (-0.00011-(0)));
            yy = -15 + (((tickAnim - 53) / 4) * (-120-(-15)));
            zz = 0 + (((tickAnim - 53) / 4) * (0.00005-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = -0.00011 + (((tickAnim - 57) / 5) * (0-(-0.00011)));
            yy = -120 + (((tickAnim - 57) / 5) * (-120-(-120)));
            zz = 0.00005 + (((tickAnim - 57) / 5) * (0-(0.00005)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            yy = -120 + (((tickAnim - 62) / 2) * (-10-(-120)));
            zz = 0 + (((tickAnim - 62) / 2) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 64) / 8) * (-80-(0)));
            yy = -10 + (((tickAnim - 64) / 8) * (0-(-10)));
            zz = 0 + (((tickAnim - 64) / 8) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = -80 + (((tickAnim - 72) / 8) * (-80-(-80)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = -80 + (((tickAnim - 80) / 10) * (-80-(-80)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lizard2, lizard2.rotateAngleX + (float) Math.toRadians(xx), lizard2.rotateAngleY + (float) Math.toRadians(yy), lizard2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 23) * (0-(-5)));
            zz = -4.5 + (((tickAnim - 0) / 23) * (-4.5-(-4.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (6-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = -4.5 + (((tickAnim - 23) / 14) * (-6-(-4.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 46) {
            xx = 6 + (((tickAnim - 37) / 9) * (6.5-(6)));
            yy = 0 + (((tickAnim - 37) / 9) * (0-(0)));
            zz = -6 + (((tickAnim - 37) / 9) * (0-(-6)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 6.5 + (((tickAnim - 46) / 7) * (5.72-(6.5)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (3.19-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 5.72 + (((tickAnim - 53) / 10) * (0.41-(5.72)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 3.19 + (((tickAnim - 53) / 10) * (0.37-(3.19)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0.41 + (((tickAnim - 63) / 5) * (0-(0.41)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0.37 + (((tickAnim - 63) / 5) * (3.5-(0.37)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (-5-(0)));
            zz = 3.5 + (((tickAnim - 68) / 12) * (4-(3.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = -5 + (((tickAnim - 80) / 10) * (-9-(-5)));
            zz = 4 + (((tickAnim - 80) / 10) * (4-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lizard2.rotationPointX = this.lizard2.rotationPointX + (float)(xx);
        this.lizard2.rotationPointY = this.lizard2.rotationPointY - (float)(yy);
        this.lizard2.rotationPointZ = this.lizard2.rotationPointZ + (float)(zz);



        this.setRotateAngle(legLR, legLR.rotateAngleX + (float) Math.toRadians(0), legLR.rotateAngleY + (float) Math.toRadians(0), legLR.rotateAngleZ + (float) Math.toRadians(30*Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))));


        this.setRotateAngle(legLF, legLF.rotateAngleX + (float) Math.toRadians(0), legLF.rotateAngleY + (float) Math.toRadians(0), legLF.rotateAngleZ + (float) Math.toRadians(10*Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))));


        this.setRotateAngle(legRR, legRR.rotateAngleX + (float) Math.toRadians(0), legRR.rotateAngleY + (float) Math.toRadians(0), legRR.rotateAngleZ + (float) Math.toRadians(-30*Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))));


        this.setRotateAngle(legRF, legRF.rotateAngleX + (float) Math.toRadians(0), legRF.rotateAngleY + (float) Math.toRadians(0), legRF.rotateAngleZ + (float) Math.toRadians(-30*Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(-30*Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 0) / 18) * (30-(30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 18) / 9) * (0-(30)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 0) / 18) * (30-(30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 18) / 9) * (30-(30)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 27) / 3) * (0-(30)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (-20-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 36) / 6) * (0-(0)));
            yy = -20 + (((tickAnim - 36) / 6) * (-30-(-20)));
            zz = 0 + (((tickAnim - 36) / 6) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 42) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (40-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 50) / 5) * (0-(40)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (-40-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            yy = -40 + (((tickAnim - 58) / 5) * (0-(-40)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (60-(0)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 60 + (((tickAnim - 68) / 10) * (0-(60)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 0) / 18) * (30-(30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 18) / 9) * (30-(30)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 30 + (((tickAnim - 27) / 4) * (0-(30)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (-20-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 5) * (-30-(-20)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 43) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 4) * (40-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 52) / 5) * (0-(40)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (-40-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            yy = -40 + (((tickAnim - 60) / 4) * (0-(-40)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 64) / 5) * (-20-(0)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 5) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -20 + (((tickAnim - 69) / 11) * (0-(-20)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 30 + (((tickAnim - 0) / 26) * (30-(30)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 30 + (((tickAnim - 26) / 8) * (0-(30)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 34) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 21) * (20-(0)));
            zz = 0 + (((tickAnim - 34) / 21) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 55) / 3) * (0-(20)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 5) * (-30-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            yy = -30 + (((tickAnim - 63) / 3) * (-30-(-30)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 66) / 4) * (30-(0)));
            yy = -30 + (((tickAnim - 66) / 4) * (-30-(-30)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 30 + (((tickAnim - 70) / 4) * (40-(30)));
            yy = -30 + (((tickAnim - 70) / 4) * (-30-(-30)));
            zz = 0 + (((tickAnim - 70) / 4) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 78) {
            xx = 40 + (((tickAnim - 74) / 4) * (0-(40)));
            yy = -30 + (((tickAnim - 74) / 4) * (-30-(-30)));
            zz = 0 + (((tickAnim - 74) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 0) / 26) * (20-(20)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 20 + (((tickAnim - 26) / 8) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 8) * (20-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 2) * (25-(20)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 36) / 6) * (0-(0)));
            yy = 25 + (((tickAnim - 36) / 6) * (30-(25)));
            zz = 0 + (((tickAnim - 36) / 6) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 30 + (((tickAnim - 42) / 3) * (0-(30)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 4) * (-10-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = -10 + (((tickAnim - 49) / 6) * (-10-(-10)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = -10 + (((tickAnim - 55) / 3) * (30-(-10)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            yy = 30 + (((tickAnim - 58) / 4) * (0-(30)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 1) * (20-(0)));
            zz = 0 + (((tickAnim - 62) / 1) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 63) / 5) * (-10-(20)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 68) / 4) * (40-(0)));
            yy = -10 + (((tickAnim - 68) / 4) * (20-(-10)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }

}
