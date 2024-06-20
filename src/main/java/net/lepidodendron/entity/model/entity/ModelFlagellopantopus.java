package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFlagellopantopus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFlagellopantopus extends ModelBasePalaeopedia {
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

    private ModelAnimator animator;

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
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(legRs1, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(legRss1, 0.0F, 0.0F, -0.7F);
        this.setRotateAngle(legRsss1, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(legRs2, 0.0F, 0.0F, 2.0F);
        this.setRotateAngle(legRss2, 0.0F, 0.0F, -2.3F);
        this.setRotateAngle(legRsss2, 0.0F, 0.0F, -1.8F);
        this.setRotateAngle(legR3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(legRs3, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(legRss3, 0.0F, 0.0F, -0.7F);
        this.setRotateAngle(legRsss3, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(legR4, -0.2F, 0.5F, -1.0F);
        this.setRotateAngle(legRs4, 0.0F, 0.0F, 2.0F);
        this.setRotateAngle(legRss4, 0.0F, 0.0F, -2.1F);
        this.setRotateAngle(legRsss4, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(legLs1, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(legLss1, 0.0F, 0.0F, 0.7F);
        this.setRotateAngle(legLsss1, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(legLs2, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legLss2, 0.0F, 0.0F, 2.3F);
        this.setRotateAngle(legLsss2, 0.0F, 0.0F, 1.8F);
        this.setRotateAngle(legL3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(legLs3, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(legLss3, 0.0F, 0.0F, 0.7F);
        this.setRotateAngle(legLsss3, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(legL4, -0.2F, -0.5F, 1.0F);
        this.setRotateAngle(legLs4, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legLss4, 0.0F, 0.0F, 2.1F);
        this.setRotateAngle(legLsss4, 0.0F, 0.0F, 2.0F);
        this.Body.offsetZ = 0.02F;
        this.Body.offsetY = -0.05F;
        this.Body.offsetX = 0.0F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.offsetZ = -0.080F;
        this.Body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.5F;
        this.Body.offsetX = -0.55F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 3.45F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, -0.2F, 2.5F, 0.3F);
        this.setRotateAngle(tail, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(legRs1, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(legRss1, 0.0F, 0.0F, -0.7F);
        this.setRotateAngle(legRsss1, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(legRs2, 0.0F, 0.0F, 2.0F);
        this.setRotateAngle(legRss2, 0.0F, 0.0F, -2.3F);
        this.setRotateAngle(legRsss2, 0.0F, 0.0F, -1.8F);
        this.setRotateAngle(legR3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(legRs3, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(legRss3, 0.0F, 0.0F, -0.7F);
        this.setRotateAngle(legRsss3, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(legR4, -0.2F, 0.5F, -1.0F);
        this.setRotateAngle(legRs4, 0.0F, 0.0F, 2.0F);
        this.setRotateAngle(legRss4, 0.0F, 0.0F, -2.1F);
        this.setRotateAngle(legRsss4, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(legLs1, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(legLss1, 0.0F, 0.0F, 0.7F);
        this.setRotateAngle(legLsss1, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(legLs2, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legLss2, 0.0F, 0.0F, 2.3F);
        this.setRotateAngle(legLsss2, 0.0F, 0.0F, 1.8F);
        this.setRotateAngle(legL3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(legLs3, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(legLss3, 0.0F, 0.0F, 0.7F);
        this.setRotateAngle(legLsss3, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(legL4, -0.2F, -0.5F, 1.0F);
        this.setRotateAngle(legLs4, 0.0F, 0.0F, -2.0F);
        this.setRotateAngle(legLss4, 0.0F, 0.0F, 2.1F);
        this.setRotateAngle(legLsss4, 0.0F, 0.0F, 2.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        EntityPrehistoricFloraFlagellopantopus entityFlagellopantopus = (EntityPrehistoricFloraFlagellopantopus) e;

        if (!entityFlagellopantopus.isReallyInWater()) {
            //this.bob(Base, 0.2F, 2.5F, false, f2, 1);
        }


    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);        this.resetToDefaultPose();
        EntityPrehistoricFloraFlagellopantopus ee = (EntityPrehistoricFloraFlagellopantopus) entitylivingbaseIn;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFlagellopantopus entity = (EntityPrehistoricFloraFlagellopantopus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 0) / 40) * (-12.5-(-20)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 40) / 40) * (-20-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 4 + (((tickAnim - 0) / 40) * (2-(4)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 2 + (((tickAnim - 40) / 40) * (4-(2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 0) / 40) * (17.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 17.5 + (((tickAnim - 40) / 40) * (-12.5-(17.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.38966-(0)));
            zz = -37.5 + (((tickAnim - 0) / 8) * (-27.57432-(-37.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -1.11824 + (((tickAnim - 8) / 11) * (-12.56712-(-1.11824)));
            yy = 1.38966 + (((tickAnim - 8) / 11) * (4.37669-(1.38966)));
            zz = -27.57432 + (((tickAnim - 8) / 11) * (7.2854-(-27.57432)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -12.56712 + (((tickAnim - 19) / 21) * (9.48408-(-12.56712)));
            yy = 4.37669 + (((tickAnim - 19) / 21) * (4.2694-(4.37669)));
            zz = 7.2854 + (((tickAnim - 19) / 21) * (-19.32417-(7.2854)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 9.48408 + (((tickAnim - 40) / 20) * (16.66698-(9.48408)));
            yy = 4.2694 + (((tickAnim - 40) / 20) * (6.87636-(4.2694)));
            zz = -19.32417 + (((tickAnim - 40) / 20) * (-55.66794-(-19.32417)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 16.66698 + (((tickAnim - 60) / 20) * (0-(16.66698)));
            yy = 6.87636 + (((tickAnim - 60) / 20) * (0-(6.87636)));
            zz = -55.66794 + (((tickAnim - 60) / 20) * (-37.5-(-55.66794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 80 + (((tickAnim - 0) / 19) * (73.54-(80)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 73.54 + (((tickAnim - 19) / 21) * (-5-(73.54)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = -5 + (((tickAnim - 40) / 20) * (65-(-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 65 + (((tickAnim - 60) / 20) * (80-(65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs1, legRs1.rotateAngleX + (float) Math.toRadians(xx), legRs1.rotateAngleY + (float) Math.toRadians(yy), legRs1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -35 + (((tickAnim - 0) / 40) * (90-(-35)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 90 + (((tickAnim - 40) / 20) * (-41.25-(90)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -41.25 + (((tickAnim - 60) / 20) * (-35-(-41.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss1, legRss1.rotateAngleX + (float) Math.toRadians(xx), legRss1.rotateAngleY + (float) Math.toRadians(yy), legRss1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -137.5 + (((tickAnim - 0) / 40) * (-30-(-137.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = -30 + (((tickAnim - 40) / 20) * (-126.25-(-30)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -126.25 + (((tickAnim - 60) / 20) * (-137.5-(-126.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss1, legRsss1.rotateAngleX + (float) Math.toRadians(xx), legRsss1.rotateAngleY + (float) Math.toRadians(yy), legRsss1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.38966-(0)));
            zz = 37.5 + (((tickAnim - 0) / 8) * (27.57432-(37.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -1.11824 + (((tickAnim - 8) / 11) * (-12.56712-(-1.11824)));
            yy = -1.38966 + (((tickAnim - 8) / 11) * (-4.37669-(-1.38966)));
            zz = 27.57432 + (((tickAnim - 8) / 11) * (-7.2854-(27.57432)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -12.56712 + (((tickAnim - 19) / 21) * (9.48408-(-12.56712)));
            yy = -4.37669 + (((tickAnim - 19) / 21) * (-4.2694-(-4.37669)));
            zz = -7.2854 + (((tickAnim - 19) / 21) * (19.32417-(-7.2854)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 9.48408 + (((tickAnim - 40) / 20) * (16.66698-(9.48408)));
            yy = -4.2694 + (((tickAnim - 40) / 20) * (-6.87636-(-4.2694)));
            zz = 19.32417 + (((tickAnim - 40) / 20) * (55.66794-(19.32417)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 16.66698 + (((tickAnim - 60) / 20) * (0-(16.66698)));
            yy = -6.87636 + (((tickAnim - 60) / 20) * (0-(-6.87636)));
            zz = 55.66794 + (((tickAnim - 60) / 20) * (37.5-(55.66794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = -80 + (((tickAnim - 0) / 19) * (-73.54-(-80)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = -73.54 + (((tickAnim - 19) / 21) * (5-(-73.54)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 5 + (((tickAnim - 40) / 20) * (-65-(5)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -65 + (((tickAnim - 60) / 20) * (-80-(-65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs1, legLs1.rotateAngleX + (float) Math.toRadians(xx), legLs1.rotateAngleY + (float) Math.toRadians(yy), legLs1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 35 + (((tickAnim - 0) / 40) * (-90-(35)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = -90 + (((tickAnim - 40) / 20) * (41.25-(-90)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 41.25 + (((tickAnim - 60) / 20) * (35-(41.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss1, legLss1.rotateAngleX + (float) Math.toRadians(xx), legLss1.rotateAngleY + (float) Math.toRadians(yy), legLss1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 137.5 + (((tickAnim - 0) / 40) * (30-(137.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 30 + (((tickAnim - 40) / 20) * (126.25-(30)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 126.25 + (((tickAnim - 60) / 20) * (137.5-(126.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss1, legLsss1.rotateAngleX + (float) Math.toRadians(xx), legLsss1.rotateAngleY + (float) Math.toRadians(yy), legLsss1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9.48408 + (((tickAnim - 0) / 20) * (16.66698-(9.48408)));
            yy = -4.2694 + (((tickAnim - 0) / 20) * (-6.87636-(-4.2694)));
            zz = 19.32417 + (((tickAnim - 0) / 20) * (55.66794-(19.32417)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 16.66698 + (((tickAnim - 20) / 20) * (0-(16.66698)));
            yy = -6.87636 + (((tickAnim - 20) / 20) * (0-(-6.87636)));
            zz = 55.66794 + (((tickAnim - 20) / 20) * (37.5-(55.66794)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (-1.38966-(0)));
            zz = 37.5 + (((tickAnim - 40) / 8) * (27.57432-(37.5)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = -1.11824 + (((tickAnim - 48) / 10) * (-12.56712-(-1.11824)));
            yy = -1.38966 + (((tickAnim - 48) / 10) * (-4.37669-(-1.38966)));
            zz = 27.57432 + (((tickAnim - 48) / 10) * (-7.2854-(27.57432)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -12.56712 + (((tickAnim - 58) / 22) * (9.48408-(-12.56712)));
            yy = -4.37669 + (((tickAnim - 58) / 22) * (-4.2694-(-4.37669)));
            zz = -7.2854 + (((tickAnim - 58) / 22) * (19.32417-(-7.2854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 20) * (-65-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -65 + (((tickAnim - 20) / 20) * (-80-(-65)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = -80 + (((tickAnim - 40) / 18) * (-73.54-(-80)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = -73.54 + (((tickAnim - 58) / 22) * (5-(-73.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs2, legLs2.rotateAngleX + (float) Math.toRadians(xx), legLs2.rotateAngleY + (float) Math.toRadians(yy), legLs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = -90 + (((tickAnim - 0) / 20) * (41.25-(-90)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 41.25 + (((tickAnim - 20) / 20) * (35-(41.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 35 + (((tickAnim - 40) / 40) * (-90-(35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss2, legLss2.rotateAngleX + (float) Math.toRadians(xx), legLss2.rotateAngleY + (float) Math.toRadians(yy), legLss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 20) * (126.25-(30)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 126.25 + (((tickAnim - 20) / 20) * (137.5-(126.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 137.5 + (((tickAnim - 40) / 40) * (30-(137.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss2, legLsss2.rotateAngleX + (float) Math.toRadians(xx), legLsss2.rotateAngleY + (float) Math.toRadians(yy), legLsss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.38966-(0)));
            zz = 37.5 + (((tickAnim - 0) / 13) * (27.57432-(37.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -1.11824 + (((tickAnim - 13) / 11) * (-12.56712-(-1.11824)));
            yy = -1.38966 + (((tickAnim - 13) / 11) * (-4.37669-(-1.38966)));
            zz = 27.57432 + (((tickAnim - 13) / 11) * (-7.2854-(27.57432)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = -12.56712 + (((tickAnim - 24) / 22) * (9.48408-(-12.56712)));
            yy = -4.37669 + (((tickAnim - 24) / 22) * (-4.2694-(-4.37669)));
            zz = -7.2854 + (((tickAnim - 24) / 22) * (19.32417-(-7.2854)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 9.48408 + (((tickAnim - 46) / 19) * (16.66698-(9.48408)));
            yy = -4.2694 + (((tickAnim - 46) / 19) * (-6.87636-(-4.2694)));
            zz = 19.32417 + (((tickAnim - 46) / 19) * (55.66794-(19.32417)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 16.66698 + (((tickAnim - 65) / 15) * (0-(16.66698)));
            yy = -6.87636 + (((tickAnim - 65) / 15) * (0-(-6.87636)));
            zz = 55.66794 + (((tickAnim - 65) / 15) * (37.5-(55.66794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = -80 + (((tickAnim - 0) / 24) * (-73.54-(-80)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            zz = -73.54 + (((tickAnim - 24) / 22) * (5-(-73.54)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = 5 + (((tickAnim - 46) / 19) * (-65-(5)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = -65 + (((tickAnim - 65) / 15) * (-80-(-65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs3, legLs3.rotateAngleX + (float) Math.toRadians(xx), legLs3.rotateAngleY + (float) Math.toRadians(yy), legLs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 35 + (((tickAnim - 0) / 46) * (-90-(35)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = -90 + (((tickAnim - 46) / 19) * (41.25-(-90)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 41.25 + (((tickAnim - 65) / 15) * (35-(41.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss3, legLss3.rotateAngleX + (float) Math.toRadians(xx), legLss3.rotateAngleY + (float) Math.toRadians(yy), legLss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 137.5 + (((tickAnim - 0) / 46) * (30-(137.5)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = 30 + (((tickAnim - 46) / 19) * (126.25-(30)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 126.25 + (((tickAnim - 65) / 15) * (137.5-(126.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss3, legLsss3.rotateAngleX + (float) Math.toRadians(xx), legLsss3.rotateAngleY + (float) Math.toRadians(yy), legLsss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 9.48408 + (((tickAnim - 0) / 23) * (-34.23456-(9.48408)));
            yy = -4.2694 + (((tickAnim - 0) / 23) * (23.5013-(-4.2694)));
            zz = 19.32417 + (((tickAnim - 0) / 23) * (55.75145-(19.32417)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -34.23456 + (((tickAnim - 23) / 20) * (0-(-34.23456)));
            yy = 23.5013 + (((tickAnim - 23) / 20) * (10-(23.5013)));
            zz = 55.75145 + (((tickAnim - 23) / 20) * (37.5-(55.75145)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 43) / 8) * (-1.11824-(0)));
            yy = 10 + (((tickAnim - 43) / 8) * (-1.38966-(10)));
            zz = 37.5 + (((tickAnim - 43) / 8) * (27.57432-(37.5)));
        }
        else if (tickAnim >= 51 && tickAnim < 62) {
            xx = -1.11824 + (((tickAnim - 51) / 11) * (-12.56712-(-1.11824)));
            yy = -1.38966 + (((tickAnim - 51) / 11) * (-4.37669-(-1.38966)));
            zz = 27.57432 + (((tickAnim - 51) / 11) * (-7.2854-(27.57432)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -12.56712 + (((tickAnim - 62) / 18) * (9.48408-(-12.56712)));
            yy = -4.37669 + (((tickAnim - 62) / 18) * (-4.2694-(-4.37669)));
            zz = -7.2854 + (((tickAnim - 62) / 18) * (19.32417-(-7.2854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 23) * (-65-(5)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = -65 + (((tickAnim - 23) / 20) * (-80-(-65)));
        }
        else if (tickAnim >= 43 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 43) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 19) * (0-(0)));
            zz = -80 + (((tickAnim - 43) / 19) * (-73.54-(-80)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = -73.54 + (((tickAnim - 62) / 18) * (5-(-73.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs4, legLs4.rotateAngleX + (float) Math.toRadians(xx), legLs4.rotateAngleY + (float) Math.toRadians(yy), legLs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -90 + (((tickAnim - 0) / 23) * (41.25-(-90)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 41.25 + (((tickAnim - 23) / 20) * (35-(41.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 35 + (((tickAnim - 43) / 37) * (-90-(35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLss4, legLss4.rotateAngleX + (float) Math.toRadians(xx), legLss4.rotateAngleY + (float) Math.toRadians(yy), legLss4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 23) * (126.25-(30)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 126.25 + (((tickAnim - 23) / 20) * (137.5-(126.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 137.5 + (((tickAnim - 43) / 37) * (30-(137.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLsss4, legLsss4.rotateAngleX + (float) Math.toRadians(xx), legLsss4.rotateAngleY + (float) Math.toRadians(yy), legLsss4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9.48408 + (((tickAnim - 0) / 20) * (16.66698-(9.48408)));
            yy = 4.2694 + (((tickAnim - 0) / 20) * (6.87636-(4.2694)));
            zz = -19.32417 + (((tickAnim - 0) / 20) * (-55.66794-(-19.32417)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 16.66698 + (((tickAnim - 20) / 20) * (0-(16.66698)));
            yy = 6.87636 + (((tickAnim - 20) / 20) * (0-(6.87636)));
            zz = -55.66794 + (((tickAnim - 20) / 20) * (-37.5-(-55.66794)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (1.38966-(0)));
            zz = -37.5 + (((tickAnim - 40) / 8) * (-27.57432-(-37.5)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = -1.11824 + (((tickAnim - 48) / 10) * (-12.56712-(-1.11824)));
            yy = 1.38966 + (((tickAnim - 48) / 10) * (4.37669-(1.38966)));
            zz = -27.57432 + (((tickAnim - 48) / 10) * (7.2854-(-27.57432)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -12.56712 + (((tickAnim - 58) / 22) * (9.48408-(-12.56712)));
            yy = 4.37669 + (((tickAnim - 58) / 22) * (4.2694-(4.37669)));
            zz = 7.2854 + (((tickAnim - 58) / 22) * (-19.32417-(7.2854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 20) * (65-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 65 + (((tickAnim - 20) / 20) * (80-(65)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 80 + (((tickAnim - 40) / 18) * (73.54-(80)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 73.54 + (((tickAnim - 58) / 22) * (-5-(73.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs2, legRs2.rotateAngleX + (float) Math.toRadians(xx), legRs2.rotateAngleY + (float) Math.toRadians(yy), legRs2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 90 + (((tickAnim - 0) / 20) * (-41.25-(90)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -41.25 + (((tickAnim - 20) / 20) * (-35-(-41.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -35 + (((tickAnim - 40) / 40) * (90-(-35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss2, legRss2.rotateAngleX + (float) Math.toRadians(xx), legRss2.rotateAngleY + (float) Math.toRadians(yy), legRss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = -30 + (((tickAnim - 0) / 20) * (-126.25-(-30)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -126.25 + (((tickAnim - 20) / 20) * (-137.5-(-126.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -137.5 + (((tickAnim - 40) / 40) * (-30-(-137.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss2, legRsss2.rotateAngleX + (float) Math.toRadians(xx), legRsss2.rotateAngleY + (float) Math.toRadians(yy), legRsss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.11824-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.38966-(0)));
            zz = -37.5 + (((tickAnim - 0) / 13) * (-27.57432-(-37.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -1.11824 + (((tickAnim - 13) / 11) * (-12.56712-(-1.11824)));
            yy = 1.38966 + (((tickAnim - 13) / 11) * (4.37669-(1.38966)));
            zz = -27.57432 + (((tickAnim - 13) / 11) * (7.2854-(-27.57432)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = -12.56712 + (((tickAnim - 24) / 22) * (9.48408-(-12.56712)));
            yy = 4.37669 + (((tickAnim - 24) / 22) * (4.2694-(4.37669)));
            zz = 7.2854 + (((tickAnim - 24) / 22) * (-19.32417-(7.2854)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 9.48408 + (((tickAnim - 46) / 19) * (16.66698-(9.48408)));
            yy = 4.2694 + (((tickAnim - 46) / 19) * (6.87636-(4.2694)));
            zz = -19.32417 + (((tickAnim - 46) / 19) * (-55.66794-(-19.32417)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 16.66698 + (((tickAnim - 65) / 15) * (0-(16.66698)));
            yy = 6.87636 + (((tickAnim - 65) / 15) * (0-(6.87636)));
            zz = -55.66794 + (((tickAnim - 65) / 15) * (-37.5-(-55.66794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 80 + (((tickAnim - 0) / 24) * (73.54-(80)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            zz = 73.54 + (((tickAnim - 24) / 22) * (-5-(73.54)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = -5 + (((tickAnim - 46) / 19) * (65-(-5)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 65 + (((tickAnim - 65) / 15) * (80-(65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs3, legRs3.rotateAngleX + (float) Math.toRadians(xx), legRs3.rotateAngleY + (float) Math.toRadians(yy), legRs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = -35 + (((tickAnim - 0) / 46) * (90-(-35)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = 90 + (((tickAnim - 46) / 19) * (-41.25-(90)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = -41.25 + (((tickAnim - 65) / 15) * (-35-(-41.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss3, legRss3.rotateAngleX + (float) Math.toRadians(xx), legRss3.rotateAngleY + (float) Math.toRadians(yy), legRss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = -137.5 + (((tickAnim - 0) / 46) * (-30-(-137.5)));
        }
        else if (tickAnim >= 46 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 19) * (0-(0)));
            zz = -30 + (((tickAnim - 46) / 19) * (-126.25-(-30)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = -126.25 + (((tickAnim - 65) / 15) * (-137.5-(-126.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss3, legRsss3.rotateAngleX + (float) Math.toRadians(xx), legRsss3.rotateAngleY + (float) Math.toRadians(yy), legRsss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 9.48408 + (((tickAnim - 0) / 23) * (-34.23456-(9.48408)));
            yy = 4.2694 + (((tickAnim - 0) / 23) * (-23.5013-(4.2694)));
            zz = -19.32417 + (((tickAnim - 0) / 23) * (-55.75145-(-19.32417)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -34.23456 + (((tickAnim - 23) / 20) * (0-(-34.23456)));
            yy = -23.5013 + (((tickAnim - 23) / 20) * (-10-(-23.5013)));
            zz = -55.75145 + (((tickAnim - 23) / 20) * (-37.5-(-55.75145)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 43) / 8) * (-1.11824-(0)));
            yy = -10 + (((tickAnim - 43) / 8) * (1.38966-(-10)));
            zz = -37.5 + (((tickAnim - 43) / 8) * (-27.57432-(-37.5)));
        }
        else if (tickAnim >= 51 && tickAnim < 62) {
            xx = -1.11824 + (((tickAnim - 51) / 11) * (-12.56712-(-1.11824)));
            yy = 1.38966 + (((tickAnim - 51) / 11) * (4.37669-(1.38966)));
            zz = -27.57432 + (((tickAnim - 51) / 11) * (7.2854-(-27.57432)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -12.56712 + (((tickAnim - 62) / 18) * (9.48408-(-12.56712)));
            yy = 4.37669 + (((tickAnim - 62) / 18) * (4.2694-(4.37669)));
            zz = 7.2854 + (((tickAnim - 62) / 18) * (-19.32417-(7.2854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 23) * (65-(-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 65 + (((tickAnim - 23) / 20) * (80-(65)));
        }
        else if (tickAnim >= 43 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 43) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 19) * (0-(0)));
            zz = 80 + (((tickAnim - 43) / 19) * (73.54-(80)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 73.54 + (((tickAnim - 62) / 18) * (-5-(73.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs4, legRs4.rotateAngleX + (float) Math.toRadians(xx), legRs4.rotateAngleY + (float) Math.toRadians(yy), legRs4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 90 + (((tickAnim - 0) / 23) * (-41.25-(90)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = -41.25 + (((tickAnim - 23) / 20) * (-35-(-41.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = -35 + (((tickAnim - 43) / 37) * (90-(-35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRss4, legRss4.rotateAngleX + (float) Math.toRadians(xx), legRss4.rotateAngleY + (float) Math.toRadians(yy), legRss4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -30 + (((tickAnim - 0) / 23) * (-126.25-(-30)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = -126.25 + (((tickAnim - 23) / 20) * (-137.5-(-126.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = -137.5 + (((tickAnim - 43) / 37) * (-30-(-137.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRsss4, legRsss4.rotateAngleX + (float) Math.toRadians(xx), legRsss4.rotateAngleY + (float) Math.toRadians(yy), legRsss4.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            EntityPrehistoricFloraFlagellopantopus e = (EntityPrehistoricFloraFlagellopantopus) entity;
        animator.update(entity);


    }
}
