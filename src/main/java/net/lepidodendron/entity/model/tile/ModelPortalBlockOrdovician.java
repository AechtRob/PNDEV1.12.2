package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockOrdovician extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer trilobite;
    private final AdvancedModelRenderer legLR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legLF;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legRR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legRF;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer trilobite2;
    private final AdvancedModelRenderer legLR2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legLF2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legRR2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legRF2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer sponge;
    private final AdvancedModelRenderer sponge2;
    private final AdvancedModelRenderer sponge3;
    private final AdvancedModelRenderer sponge4;

    public ModelPortalBlockOrdovician() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        trilobite = new AdvancedModelRenderer(this);
        trilobite.setRotationPoint(0.0F, 7.3333F, 0.5F);
        trilobite.cubeList.add(new ModelBox(trilobite, 10, 32, -0.5F, -0.3333F, -1.5F, 1, 1, 3, 0.0F, false));
        trilobite.cubeList.add(new ModelBox(trilobite, 0, 32, -1.0F, -0.0833F, -1.5F, 2, 0, 3, 0.0F, false));
        trilobite.cubeList.add(new ModelBox(trilobite, 18, 32, -0.5F, -0.0833F, -2.0F, 1, 0, 1, 0.0F, false));

        legLR = new AdvancedModelRenderer(this);
        legLR.setRotationPoint(-0.5F, 0.4167F, -1.0F);
        trilobite.addChild(legLR);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLR.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLF = new AdvancedModelRenderer(this);
        legLF.setRotationPoint(-0.5F, 0.4167F, 1.0F);
        trilobite.addChild(legLF);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        legLF.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.0F, -0.5672F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legRR = new AdvancedModelRenderer(this);
        legRR.setRotationPoint(0.5F, 0.4167F, -1.0F);
        trilobite.addChild(legRR);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRR.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.0F, 0.5672F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        legRF = new AdvancedModelRenderer(this);
        legRF.setRotationPoint(0.5F, 0.4167F, 1.0F);
        trilobite.addChild(legRF);


        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        legRF.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5672F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        antennaR = new AdvancedModelRenderer(this);
        antennaR.setRotationPoint(0.3772F, -0.3333F, 1.5F);
        trilobite.addChild(antennaR);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.3265F);
        antennaR.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 32, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        antennaL = new AdvancedModelRenderer(this);
        antennaL.setRotationPoint(-0.3772F, -0.3333F, 1.5F);
        trilobite.addChild(antennaL);


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 0.0F, 0.3265F);
        antennaL.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 32, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        trilobite2 = new AdvancedModelRenderer(this);
        trilobite2.setRotationPoint(0.0F, 7.3333F, 0.5F);
        trilobite2.cubeList.add(new ModelBox(trilobite2, 10 + 31, 32, -0.5F, -0.3333F, -1.5F, 1, 1, 3, 0.0F, false));
        trilobite2.cubeList.add(new ModelBox(trilobite2, 0 + 31, 32, -1.0F, -0.0833F, -1.5F, 2, 0, 3, 0.0F, false));
        trilobite2.cubeList.add(new ModelBox(trilobite2, 18 + 31, 32, -0.5F, -0.0833F, -2.0F, 1, 0, 1, 0.0F, false));

        legLR2 = new AdvancedModelRenderer(this);
        legLR2.setRotationPoint(-1.0F, 0.4167F, -1.0F);
        trilobite2.addChild(legLR2);


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.5F, 0.0F, 0.0F);
        legLR2.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.0F, -0.5672F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 21 + 31, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legLF2 = new AdvancedModelRenderer(this);
        legLF2.setRotationPoint(-1.0F, 0.4167F, 1.0F);
        trilobite2.addChild(legLF2);


        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
        legLF2.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, 0.0F, -0.5672F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 21 + 31, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        legRR2 = new AdvancedModelRenderer(this);
        legRR2.setRotationPoint(1.0F, 0.4167F, -1.0F);
        trilobite2.addChild(legRR2);


        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        legRR2.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, 0.0F, 0.5672F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 21 + 31, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        legRF2 = new AdvancedModelRenderer(this);
        legRF2.setRotationPoint(1.0F, 0.4167F, 1.0F);
        trilobite2.addChild(legRF2);


        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(-0.5F, 0.0F, 0.0F);
        legRF2.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5672F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 21 + 31, 32, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        antennaR2 = new AdvancedModelRenderer(this);
        antennaR2.setRotationPoint(0.3772F, -0.3333F, 1.8265F);
        trilobite2.addChild(antennaR2);


        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        antennaR2.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 22 + 31, 32, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        antennaL2 = new AdvancedModelRenderer(this);
        antennaL2.setRotationPoint(-0.3772F, -0.3333F, 1.8265F);
        trilobite2.addChild(antennaL2);


        cube_r12 = new AdvancedModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        antennaL2.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 22 + 31, 32, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        sponge = new AdvancedModelRenderer(this);
        sponge.scaleChildren = true;
        sponge.setRotationPoint(0.5F, 24.0F, -0.5F);
        sponge.cubeList.add(new ModelBox(sponge, 0, 41, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 39, -0.5F, -7.0F, -1.5F, 1, 3, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 44, -0.5F, -5.0F, 0.5F, 1, 1, 2, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 39, 0.5F, -8.0F, 1.5F, 1, 4, 1, 0.0F, false));
        sponge.cubeList.add(new ModelBox(sponge, 0, 39, -1.5F, -9.0F, 0.5F, 1, 5, 1, 0.0F, false));

        sponge2 = new AdvancedModelRenderer(this);
        sponge2.scaleChildren = true;
        sponge2.setRotationPoint(0.5F, 24.0F, -0.5F);
        sponge2.cubeList.add(new ModelBox(sponge2, 9, 39, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 9, 42, -0.5F, -3.0F, -1.5F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 13, 39, 1.5F, -6.0F, -1.5F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 13, 42, -2.5F, -6.0F, -1.5F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 17, 44, -3.0F, -7.0F, -2.0F, 2, 1, 2, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 8, 46, -2.5F, -7.02F, -1.5F, 1, 0, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 17, 44, 1.0F, -7.0F, -2.0F, 2, 1, 2, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 8, 46, 1.5F, -7.02F, -1.5F, 1, 0, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 17, 40, -1.0F, -7.96F, 0.0F, 2, 2, 2, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 8, 46, -0.5F, -7.98F, 0.5F, 1, 0, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 17, 40, -1.0F, -6.96F, -4.0F, 2, 2, 2, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 8, 46, -0.5F, -6.98F, -3.5F, 1, 0, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 9, 39, -0.5F, -4.96F, -3.5F, 1, 1, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 9, 42, -0.5F, -5.96F, 0.5F, 1, 2, 1, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 25, 41, -0.5F, -3.96F, -3.5F, 1, 1, 5, 0.0F, false));
        sponge2.cubeList.add(new ModelBox(sponge2, 20, 45, -2.5F, -4.0F, -1.5F, 5, 1, 1, 0.0F, false));

        sponge3 = new AdvancedModelRenderer(this);
        sponge3.scaleChildren = true;
        sponge3.setRotationPoint(0.5F, 24.0F, -3.0F);
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 41, -0.5F, -6.0F, 2.0F, 1, 4, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 41, -0.5F, -3.0F, 1.0F, 1, 2, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 41, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 39, -0.5F, -8.0F, 1.0F, 1, 3, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 44, -0.5F, -6.0F, 3.0F, 1, 1, 2, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 39, 0.5F, -9.0F, 4.0F, 1, 4, 1, 0.0F, false));
        sponge3.cubeList.add(new ModelBox(sponge3, 0, 39, -1.5F, -10.0F, 3.0F, 1, 5, 1, 0.0F, false));

        sponge4 = new AdvancedModelRenderer(this);
        sponge4.scaleChildren = true;
        sponge4.setRotationPoint(0.5F, 24.0F, -3.0F);
        sponge4.cubeList.add(new ModelBox(sponge4, 9, 39, -0.5F, -3.0F, 2.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 9, 39, -0.5F, -2.0F, 1.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 13, 39, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 9, 42, -0.5F, -4.0F, 3.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 13, 39, 1.5F, -7.0F, 3.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 13, 42, -2.5F, -7.0F, 3.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 17, 44, -3.0F, -8.0F, 2.5F, 2, 1, 2, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 8, 46, -2.5F, -8.02F, 3.0F, 1, 0, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 17, 44, 1.0F, -8.0F, 2.5F, 2, 1, 2, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 8, 46, 1.5F, -8.02F, 3.0F, 1, 0, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 17, 40, -1.0F, -8.96F, 4.5F, 2, 2, 2, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 8, 46, -0.5F, -8.98F, 5.0F, 1, 0, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 17, 40, -1.0F, -7.96F, 0.5F, 2, 2, 2, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 8, 46, -0.5F, -7.98F, 1.0F, 1, 0, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 9, 39, -0.5F, -5.96F, 1.0F, 1, 1, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 9, 42, -0.5F, -6.96F, 5.0F, 1, 2, 1, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 25, 41, -0.5F, -4.96F, 1.0F, 1, 1, 5, 0.0F, false));
        sponge4.cubeList.add(new ModelBox(sponge4, 20, 45, -2.5F, -5.0F, 3.0F, 5, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderTrilobite1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        trilobite.render(f);
    }

    public void renderTrilobite2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        this.legLF.flap(1.0F, 0.2F, false, 0, 1.0F, f2, 1.0F);

        trilobite2.render(f);
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

    public void renderSpongeSide1(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge3.render(f);
    }

    public void renderSpongeSide2(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        sponge4.render(f);
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
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.root.setScale((float)xx, (float)yy, (float)zz);




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
        this.setRotateAngle(trilobite, trilobite.rotateAngleX + (float) Math.toRadians(xx), trilobite.rotateAngleY + (float) Math.toRadians(yy), trilobite.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = -3.2 + (((tickAnim - 22) / 9) * (-1.36-(-3.2)));
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
            yy = -5 + (((tickAnim - 80) / 10) * (-5-(-5)));
            zz = 4 + (((tickAnim - 80) / 10) * (4-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.trilobite.rotationPointX = this.trilobite.rotationPointX + (float)(xx);
        this.trilobite.rotationPointY = this.trilobite.rotationPointY - (float)(yy);
        this.trilobite.rotationPointZ = this.trilobite.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -0.5 + (((tickAnim - 0) / 28) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 0) / 28) * (16-(16)));
            zz = -3.5 + (((tickAnim - 0) / 28) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -0.5 + (((tickAnim - 28) / 10) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 28) / 10) * (16-(16)));
            zz = -3.5 + (((tickAnim - 28) / 10) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 38) / 42) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 38) / 42) * (16-(16)));
            zz = -3.5 + (((tickAnim - 38) / 42) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = -0.5 + (((tickAnim - 80) / 10) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 80) / 10) * (16-(16)));
            zz = -3.5 + (((tickAnim - 80) / 10) * (-3.5-(-3.5)));
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




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 0) / 33) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 0) / 33) * (16-(16)));
            zz = -3.5 + (((tickAnim - 0) / 33) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -0.5 + (((tickAnim - 33) / 8) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 33) / 8) * (16-(16)));
            zz = -3.5 + (((tickAnim - 33) / 8) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 41) / 39) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 41) / 39) * (16-(16)));
            zz = -3.5 + (((tickAnim - 41) / 39) * (-3.5-(-3.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = -0.5 + (((tickAnim - 80) / 10) * (-0.5-(-0.5)));
            yy = 16 + (((tickAnim - 80) / 10) * (16-(16)));
            zz = -3.5 + (((tickAnim - 80) / 10) * (-3.5-(-3.5)));
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
            xx = 3.5 + (((tickAnim - 0) / 90) * (3.5-(3.5)));
            yy = 7 + (((tickAnim - 0) / 90) * (7-(7)));
            zz = 11 + (((tickAnim - 0) / 90) * (11-(11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge3.rotationPointX = this.sponge3.rotationPointX + (float)(xx);
        this.sponge3.rotationPointY = this.sponge3.rotationPointY - (float)(yy);
        this.sponge3.rotationPointZ = this.sponge3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (1-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (1-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (1-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 1 + (((tickAnim - 45) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 45) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 45) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0.97 + (((tickAnim - 52) / 6) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 52) / 6) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 52) / 6) * (1-(0.97)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 58) / 7) * (0.97-(1)));
            yy = 1 + (((tickAnim - 58) / 7) * (0.97-(1)));
            zz = 1 + (((tickAnim - 58) / 7) * (0.97-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 0.97 + (((tickAnim - 65) / 7) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 65) / 7) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 65) / 7) * (1-(0.97)));
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
        this.sponge3.setScale((float)xx, (float)yy, (float)zz);




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
            xx = 10 + (((tickAnim - 26) / 2) * (0-(10)));
            yy = 90 + (((tickAnim - 26) / 2) * (105-(90)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
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
        this.setRotateAngle(trilobite2, trilobite2.rotateAngleX + (float) Math.toRadians(xx), trilobite2.rotateAngleY + (float) Math.toRadians(yy), trilobite2.rotateAngleZ + (float) Math.toRadians(zz));


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
            yy = -5 + (((tickAnim - 80) / 10) * (-5-(-5)));
            zz = 4 + (((tickAnim - 80) / 10) * (4-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.trilobite2.rotationPointX = this.trilobite2.rotationPointX + (float)(xx);
        this.trilobite2.rotationPointY = this.trilobite2.rotationPointY - (float)(yy);
        this.trilobite2.rotationPointZ = this.trilobite2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90 + 1) {
            xx = 3.5 + (((tickAnim - 0) / 90) * (3.5-(3.5)));
            yy = 7.5 + (((tickAnim - 0) / 90) * (7.5-(7.5)));
            zz = 10 + (((tickAnim - 0) / 90) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sponge4.rotationPointX = this.sponge4.rotationPointX + (float)(xx);
        this.sponge4.rotationPointY = this.sponge4.rotationPointY - (float)(yy);
        this.sponge4.rotationPointZ = this.sponge4.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 33) / 14) * (1-(0)));
            yy = 0 + (((tickAnim - 33) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 33) / 14) * (1-(0)));
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
        this.sponge4.setScale((float)xx, (float)yy, (float)zz);


    }

}
