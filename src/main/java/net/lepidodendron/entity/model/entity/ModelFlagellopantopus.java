package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelFlagellopantopus extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer talson;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer palpR;
    private final AdvancedModelRenderer palpL;
    private final AdvancedModelRenderer ovigerR;
    private final AdvancedModelRenderer ovigerL;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legRs1;
    private final AdvancedModelRenderer legRss1;
    private final AdvancedModelRenderer legRsss1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legLs1;
    private final AdvancedModelRenderer legLss1;
    private final AdvancedModelRenderer legLsss1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legLs2;
    private final AdvancedModelRenderer legLss2;
    private final AdvancedModelRenderer legLsss2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legLs3;
    private final AdvancedModelRenderer legLss3;
    private final AdvancedModelRenderer legLsss3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legLs4;
    private final AdvancedModelRenderer legLss4;
    private final AdvancedModelRenderer legLsss4;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legRss2;
    private final AdvancedModelRenderer legRsss2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legRs3;
    private final AdvancedModelRenderer legRss3;
    private final AdvancedModelRenderer legRsss3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legRs4;
    private final AdvancedModelRenderer legRss4;
    private final AdvancedModelRenderer legRsss4;
    private final AdvancedModelRenderer proboscis;


    public ModelFlagellopantopus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.0F, -3.0F, -5.25F, 2, 1, 5, 0.0F, false));

        this.talson = new AdvancedModelRenderer(this);
        this.talson.setRotationPoint(0.0F, -3.0F, -0.25F);
        this.Body.addChild(talson);
        this.setRotateAngle(talson, -0.2618F, 0.0F, 0.0F);
        this.talson.cubeList.add(new ModelBox(talson, 9, 1, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 1.75F);
        this.talson.addChild(tail);
        this.setRotateAngle(tail, 0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -5.5F, 0.0F, 0, 6, 30, 0.0F, false));

        this.palpR = new AdvancedModelRenderer(this);
        this.palpR.setRotationPoint(-1.0F, -2.5F, -5.0F);
        this.Body.addChild(palpR);
        this.setRotateAngle(palpR, 0.0F, 0.3491F, 0.0F);
        this.palpR.cubeList.add(new ModelBox(palpR, 0, 8, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.palpL = new AdvancedModelRenderer(this);
        this.palpL.setRotationPoint(1.0F, -2.5F, -5.0F);
        this.Body.addChild(palpL);
        this.setRotateAngle(palpL, 0.0F, -0.3491F, 0.0F);
        this.palpL.cubeList.add(new ModelBox(palpL, 0, 8, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, true));

        this.ovigerR = new AdvancedModelRenderer(this);
        this.ovigerR.setRotationPoint(-1.0F, -2.5F, -4.5F);
        this.Body.addChild(ovigerR);
        this.setRotateAngle(ovigerR, 0.0F, 0.7854F, 0.0F);
        this.ovigerR.cubeList.add(new ModelBox(ovigerR, 0, 3, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.ovigerL = new AdvancedModelRenderer(this);
        this.ovigerL.setRotationPoint(1.0F, -2.5F, -4.5F);
        this.Body.addChild(ovigerL);
        this.setRotateAngle(ovigerL, 0.0F, -0.7854F, 0.0F);
        this.ovigerL.cubeList.add(new ModelBox(ovigerL, 0, 3, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -2.5F, -4.0F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 9, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs1 = new AdvancedModelRenderer(this);
        this.legRs1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR1.addChild(legRs1);
        this.setRotateAngle(legRs1, 0.0F, 0.0F, 0.8727F);
        this.legRs1.cubeList.add(new ModelBox(legRs1, 9, 0, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss1 = new AdvancedModelRenderer(this);
        this.legRss1.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs1.addChild(legRss1);
        this.setRotateAngle(legRss1, 0.0F, 0.0F, -1.7453F);
        this.legRss1.cubeList.add(new ModelBox(legRss1, 0, 6, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss1 = new AdvancedModelRenderer(this);
        this.legRsss1.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss1.addChild(legRsss1);
        this.setRotateAngle(legRsss1, 0.0F, 0.0F, 0.6545F);
        this.legRsss1.cubeList.add(new ModelBox(legRsss1, 9, 4, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, -2.5F, -4.0F);
        this.Body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 9, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, true));

        this.legLs1 = new AdvancedModelRenderer(this);
        this.legLs1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL1.addChild(legLs1);
        this.setRotateAngle(legLs1, 0.0F, 0.0F, -0.8727F);
        this.legLs1.cubeList.add(new ModelBox(legLs1, 9, 0, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, true));

        this.legLss1 = new AdvancedModelRenderer(this);
        this.legLss1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs1.addChild(legLss1);
        this.setRotateAngle(legLss1, 0.0F, 0.0F, 1.7453F);
        this.legLss1.cubeList.add(new ModelBox(legLss1, 0, 6, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, true));

        this.legLsss1 = new AdvancedModelRenderer(this);
        this.legLsss1.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss1.addChild(legLsss1);
        this.setRotateAngle(legLsss1, 0.0F, 0.0F, -0.6545F);
        this.legLsss1.cubeList.add(new ModelBox(legLsss1, 9, 4, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -2.5F, -3.0F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0873F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 9, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, true));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL2.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.0F, 0.0F, -0.8727F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 9, 0, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, true));

        this.legLss2 = new AdvancedModelRenderer(this);
        this.legLss2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs2.addChild(legLss2);
        this.setRotateAngle(legLss2, 0.0F, 0.0F, 1.7453F);
        this.legLss2.cubeList.add(new ModelBox(legLss2, 0, 6, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, true));

        this.legLsss2 = new AdvancedModelRenderer(this);
        this.legLsss2.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss2.addChild(legLsss2);
        this.setRotateAngle(legLsss2, 0.0F, 0.0F, -0.6545F);
        this.legLsss2.cubeList.add(new ModelBox(legLsss2, 9, 4, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -2.5F, -2.0F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.3491F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 9, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, true));

        this.legLs3 = new AdvancedModelRenderer(this);
        this.legLs3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL3.addChild(legLs3);
        this.setRotateAngle(legLs3, 0.0F, 0.0F, -0.8727F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 9, 0, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, true));

        this.legLss3 = new AdvancedModelRenderer(this);
        this.legLss3.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs3.addChild(legLss3);
        this.setRotateAngle(legLss3, 0.0F, 0.0F, 1.7453F);
        this.legLss3.cubeList.add(new ModelBox(legLss3, 0, 6, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, true));

        this.legLsss3 = new AdvancedModelRenderer(this);
        this.legLsss3.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss3.addChild(legLsss3);
        this.setRotateAngle(legLsss3, 0.0F, 0.0F, -0.6545F);
        this.legLsss3.cubeList.add(new ModelBox(legLsss3, 9, 4, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -2.5F, -1.0F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.6981F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 9, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, true));

        this.legLs4 = new AdvancedModelRenderer(this);
        this.legLs4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL4.addChild(legLs4);
        this.setRotateAngle(legLs4, 0.0F, 0.0F, -0.8727F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 9, 0, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, true));

        this.legLss4 = new AdvancedModelRenderer(this);
        this.legLss4.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs4.addChild(legLss4);
        this.setRotateAngle(legLss4, 0.0F, 0.0F, 1.7453F);
        this.legLss4.cubeList.add(new ModelBox(legLss4, 0, 6, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, true));

        this.legLsss4 = new AdvancedModelRenderer(this);
        this.legLsss4.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss4.addChild(legLsss4);
        this.setRotateAngle(legLsss4, 0.0F, 0.0F, -0.6545F);
        this.legLsss4.cubeList.add(new ModelBox(legLsss4, 9, 4, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -2.5F, -3.0F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.0873F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 9, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR2.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.0F, 0.0F, 0.8727F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 9, 0, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss2 = new AdvancedModelRenderer(this);
        this.legRss2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs2.addChild(legRss2);
        this.setRotateAngle(legRss2, 0.0F, 0.0F, -1.7453F);
        this.legRss2.cubeList.add(new ModelBox(legRss2, 0, 6, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss2 = new AdvancedModelRenderer(this);
        this.legRsss2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss2.addChild(legRsss2);
        this.setRotateAngle(legRsss2, 0.0F, 0.0F, 0.6545F);
        this.legRsss2.cubeList.add(new ModelBox(legRsss2, 9, 4, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -2.5F, -2.0F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.3491F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 9, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs3 = new AdvancedModelRenderer(this);
        this.legRs3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR3.addChild(legRs3);
        this.setRotateAngle(legRs3, 0.0F, 0.0F, 0.8727F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 9, 0, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss3 = new AdvancedModelRenderer(this);
        this.legRss3.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs3.addChild(legRss3);
        this.setRotateAngle(legRss3, 0.0F, 0.0F, -1.7453F);
        this.legRss3.cubeList.add(new ModelBox(legRss3, 0, 6, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss3 = new AdvancedModelRenderer(this);
        this.legRsss3.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss3.addChild(legRsss3);
        this.setRotateAngle(legRsss3, 0.0F, 0.0F, 0.6545F);
        this.legRsss3.cubeList.add(new ModelBox(legRsss3, 9, 4, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -2.5F, -1.0F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.6981F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 9, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs4 = new AdvancedModelRenderer(this);
        this.legRs4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR4.addChild(legRs4);
        this.setRotateAngle(legRs4, 0.0F, 0.0F, 0.8727F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 9, 0, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss4 = new AdvancedModelRenderer(this);
        this.legRss4.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs4.addChild(legRss4);
        this.setRotateAngle(legRss4, 0.0F, 0.0F, -1.7453F);
        this.legRss4.cubeList.add(new ModelBox(legRss4, 0, 6, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss4 = new AdvancedModelRenderer(this);
        this.legRsss4.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss4.addChild(legRsss4);
        this.setRotateAngle(legRsss4, 0.0F, 0.0F, 0.6545F);
        this.legRsss4.cubeList.add(new ModelBox(legRsss4, 9, 4, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Body.addChild(proboscis);
        this.setRotateAngle(proboscis, 0.1745F, 0.0F, 0.0F);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 5, 7, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.38F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.render(0.023F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body.offsetY = 0.75F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] armsL = {this.legL1};
        AdvancedModelRenderer[] armsR = {this.legR1};
        AdvancedModelRenderer[] legsL = {this.legL2, this.legL3, this.legL4};
        AdvancedModelRenderer[] legsR = {this.legR2, this.legR3, this.legR4};
        AdvancedModelRenderer[] tail = {this.talson, this.tail};
        float move = 1;
        if (f3 == 0) { move = 0; }

        if (isAtBottom) {
            this.flap(legL2, 0.4F * move, 0.2F, false, 3F, 0.5F, f2, 1F);
            this.flap(legL3, 0.4F * move, 0.2F, false, 0F, 0.5F, f2, 1F);
            this.flap(legL4, 0.4F * move, 0.2F, false, 2F, 0.5F, f2, 1F);

            this.flap(legR2, 0.4F * move, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.flap(legR3, 0.4F * move, 0.2F, true, 3F, 0.5F, f2, 1F);
            this.flap(legR4, 0.4F * move, 0.2F, true, -1F, 0.5F, f2, 1F);

            this.swing(legL2, 0.4F * move, 0.3F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legL3, 0.4F * move, 0.3F, false, 3F, 0.4F, f2, 0.8F);
            this.swing(legL4, 0.4F * move, 0.3F, false, 2F, 0.4F, f2, 0.8F);

            this.swing(legR2, 0.4F * move, 0.3F, true, 0F, 0.4F, f2, 0.8F);
            this.swing(legR3, 0.4F * move, 0.3F, true, 3F, 0.4F, f2, 0.8F);
            this.swing(legR4, 0.4F * move, 0.3F, true, -1F, 0.4F, f2, 0.8F);

            this.chainWave(tail, 0.5F, 0.05f, -1, f2, 0.4F);
            this.bob(Body, 0.5F, 0.02F, true, f2, 0.5F);
            if (f3 != 0) {
                this.chainSwing(armsL, 0.4F, -0.2F, 1, f2, 0.6F);
                this.chainSwing(armsR, 0.4F, 0.2F, 1, f2, 0.6F);
            }
            else {
                this.chainSwing(armsL, 0.2F, -0.1F, 1, f2, 0.4F);
                this.chainSwing(armsR, 0.2F, 0.1F, 1, f2, 0.4F);
            }
        }
        else {
            this.chainWave(legsL, 0.25F, 0.4F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.4F, -3, f2, 1);
            this.flap(legL2, 0.25F, -0.6F, false, 0.0F, -0.5F, f2, 0.6F);
            this.flap(legR2, 0.25F, 0.6F, false, 1.0F, 0.5F, f2, 0.6F);
            this.flap(legL3, 0.25F, -0.6F, false, 2.0F, -0.5F, f2, 0.6F);
            this.flap(legR3, 0.25F, 0.6F, false, 0.0F, 0.5F, f2, 0.6F);
            this.flap(legL4, 0.25F, -0.6F, false, 1.0F, -0.5F, f2, 0.6F);
            this.flap(legR4, 0.25F, 0.6F, false, 2.0F, 0.5F, f2, 0.6F);
            this.chainWave(tail, 0.5F, 0.12f, -2, f2, 0.5F);
            this.bob(Body, 0.25F, 0.2F, false, f2, 1);
            this.chainSwing(armsL, 0.25F, -0.05F, 1, f2, 0.4F);
            this.chainSwing(armsR, 0.25F, 0.05F, 1, f2, 0.4F);
            this.flap(legL1, 0.25F, -0.4F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR1, 0.25F, 0.4F, false, 2.0F, 0.5F, f2, 0.3F);
        }

        this.swing(ovigerL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.swing(ovigerR, 0.4F, 0.2F, false, 0.5F, 0.1F, f2, 0.8F);
        this.walk(palpL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.walk(palpR, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);

    }
}
