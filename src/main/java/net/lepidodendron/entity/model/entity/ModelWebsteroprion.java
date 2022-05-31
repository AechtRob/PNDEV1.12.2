package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprion;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWebsteroprion extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer jawL1;
    private final AdvancedModelRenderer jawR1;
    private final AdvancedModelRenderer jawL2;
    private final AdvancedModelRenderer jawR2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer spinesL;
    private final AdvancedModelRenderer spinesR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer spinesL2;
    private final AdvancedModelRenderer spinesR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer spinesL3;
    private final AdvancedModelRenderer spinesR3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer spinesL4;
    private final AdvancedModelRenderer spinesR4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer spinesL5;
    private final AdvancedModelRenderer spinesR5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer spinesL6;
    private final AdvancedModelRenderer spinesR6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer spinesL7;
    private final AdvancedModelRenderer spinesR7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer spinesL8;
    private final AdvancedModelRenderer spinesR8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer spinesL9;
    private final AdvancedModelRenderer spinesR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer spinesL10;
    private final AdvancedModelRenderer spinesR10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer spinesL11;
    private final AdvancedModelRenderer spinesR11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer spinesL12;
    private final AdvancedModelRenderer spinesR12;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer spinesL13;
    private final AdvancedModelRenderer spinesR13;
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer spinesL14;
    private final AdvancedModelRenderer spinesR14;
    private final AdvancedModelRenderer body15;
    private final AdvancedModelRenderer spinesL15;
    private final AdvancedModelRenderer spinesR15;
    private final AdvancedModelRenderer body16;
    private final AdvancedModelRenderer spinesL16;
    private final AdvancedModelRenderer spinesR16;
    private final AdvancedModelRenderer body17;
    private final AdvancedModelRenderer spinesL17;
    private final AdvancedModelRenderer spinesR17;
    private final AdvancedModelRenderer body18;
    private final AdvancedModelRenderer spinesL18;
    private final AdvancedModelRenderer spinesR18;
    private final AdvancedModelRenderer body19;
    private final AdvancedModelRenderer spinesL19;
    private final AdvancedModelRenderer spinesR19;
    private final AdvancedModelRenderer body20;
    private final AdvancedModelRenderer spinesL20;
    private final AdvancedModelRenderer spinesR20;
    private final AdvancedModelRenderer body21;
    private final AdvancedModelRenderer spinesL21;
    private final AdvancedModelRenderer spinesR21;
    private final AdvancedModelRenderer body22;
    private final AdvancedModelRenderer spinesL22;
    private final AdvancedModelRenderer spinesR22;
    private final AdvancedModelRenderer body23;
    private final AdvancedModelRenderer spinesL23;
    private final AdvancedModelRenderer spinesR23;
    private final AdvancedModelRenderer body24;
    private final AdvancedModelRenderer spinesL24;
    private final AdvancedModelRenderer spinesR24;
    private final AdvancedModelRenderer body25;
    private final AdvancedModelRenderer spinesL25;
    private final AdvancedModelRenderer spinesR25;
    private final AdvancedModelRenderer body26;
    private final AdvancedModelRenderer spinesL26;
    private final AdvancedModelRenderer spinesR26;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;

    private ModelAnimator animator;

    public ModelWebsteroprion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.0F, -3.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 8, -3.0F, -2.0F, -5.0F, 6, 4, 5, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.0873F, 0.0F, 0.0F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 20, 6, -0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(1.25F, -1.25F, -4.5F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0436F, -0.6109F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 20, 0, -0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(1.25F, -1.75F, -4.5F);
        this.head.addChild(tentacle4);
        this.setRotateAngle(tentacle4, -0.0436F, -0.8727F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 16, 0, -0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-1.25F, -1.75F, -4.5F);
        this.head.addChild(tentacle5);
        this.setRotateAngle(tentacle5, -0.0436F, 0.8727F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 14, 8, -0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-1.25F, -1.25F, -4.5F);
        this.head.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0436F, 0.6109F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 18, 8, -0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F, false));

        this.jawL1 = new AdvancedModelRenderer(this);
        this.jawL1.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.head.addChild(jawL1);
        this.jawL1.cubeList.add(new ModelBox(jawL1, 0, 4, 0.0F, 0.0F, -4.0F, 10, 0, 4, 0.0F, false));

        this.jawR1 = new AdvancedModelRenderer(this);
        this.jawR1.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.head.addChild(jawR1);
        this.jawR1.cubeList.add(new ModelBox(jawR1, 0, 0, -10.0F, 0.0F, -4.0F, 10, 0, 4, 0.0F, false));

        this.jawL2 = new AdvancedModelRenderer(this);
        this.jawL2.setRotationPoint(1.0F, 0.25F, -3.5F);
        this.head.addChild(jawL2);
        this.setRotateAngle(jawL2, 0.0F, -0.0873F, 0.1745F);
        this.jawL2.cubeList.add(new ModelBox(jawL2, 17, 20, 0.0F, 0.0F, -3.0F, 8, 0, 3, 0.0F, false));

        this.jawR2 = new AdvancedModelRenderer(this);
        this.jawR2.setRotationPoint(-1.0F, 0.25F, -3.5F);
        this.head.addChild(jawR2);
        this.setRotateAngle(jawR2, 0.0F, 0.0873F, -0.1745F);
        this.jawR2.cubeList.add(new ModelBox(jawR2, 13, 17, -8.0F, 0.0F, -3.0F, 8, 0, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL = new AdvancedModelRenderer(this);
        this.spinesL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(spinesL);
        this.spinesL.cubeList.add(new ModelBox(spinesL, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR = new AdvancedModelRenderer(this);
        this.spinesR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(spinesR);
        this.spinesR.cubeList.add(new ModelBox(spinesR, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL2 = new AdvancedModelRenderer(this);
        this.spinesL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(spinesL2);
        this.spinesL2.cubeList.add(new ModelBox(spinesL2, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR2 = new AdvancedModelRenderer(this);
        this.spinesR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(spinesR2);
        this.spinesR2.cubeList.add(new ModelBox(spinesR2, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL3 = new AdvancedModelRenderer(this);
        this.spinesL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(spinesL3);
        this.spinesL3.cubeList.add(new ModelBox(spinesL3, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR3 = new AdvancedModelRenderer(this);
        this.spinesR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(spinesR3);
        this.spinesR3.cubeList.add(new ModelBox(spinesR3, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL4 = new AdvancedModelRenderer(this);
        this.spinesL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(spinesL4);
        this.spinesL4.cubeList.add(new ModelBox(spinesL4, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR4 = new AdvancedModelRenderer(this);
        this.spinesR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(spinesR4);
        this.spinesR4.cubeList.add(new ModelBox(spinesR4, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL5 = new AdvancedModelRenderer(this);
        this.spinesL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(spinesL5);
        this.spinesL5.cubeList.add(new ModelBox(spinesL5, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR5 = new AdvancedModelRenderer(this);
        this.spinesR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(spinesR5);
        this.spinesR5.cubeList.add(new ModelBox(spinesR5, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL6 = new AdvancedModelRenderer(this);
        this.spinesL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addChild(spinesL6);
        this.spinesL6.cubeList.add(new ModelBox(spinesL6, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR6 = new AdvancedModelRenderer(this);
        this.spinesR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addChild(spinesR6);
        this.spinesR6.cubeList.add(new ModelBox(spinesR6, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL7 = new AdvancedModelRenderer(this);
        this.spinesL7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addChild(spinesL7);
        this.spinesL7.cubeList.add(new ModelBox(spinesL7, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR7 = new AdvancedModelRenderer(this);
        this.spinesR7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addChild(spinesR7);
        this.spinesR7.cubeList.add(new ModelBox(spinesR7, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL8 = new AdvancedModelRenderer(this);
        this.spinesL8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addChild(spinesL8);
        this.spinesL8.cubeList.add(new ModelBox(spinesL8, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR8 = new AdvancedModelRenderer(this);
        this.spinesR8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addChild(spinesR8);
        this.spinesR8.cubeList.add(new ModelBox(spinesR8, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL9 = new AdvancedModelRenderer(this);
        this.spinesL9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body9.addChild(spinesL9);
        this.spinesL9.cubeList.add(new ModelBox(spinesL9, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR9 = new AdvancedModelRenderer(this);
        this.spinesR9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body9.addChild(spinesR9);
        this.spinesR9.cubeList.add(new ModelBox(spinesR9, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL10 = new AdvancedModelRenderer(this);
        this.spinesL10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body10.addChild(spinesL10);
        this.spinesL10.cubeList.add(new ModelBox(spinesL10, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR10 = new AdvancedModelRenderer(this);
        this.spinesR10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body10.addChild(spinesR10);
        this.spinesR10.cubeList.add(new ModelBox(spinesR10, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL11 = new AdvancedModelRenderer(this);
        this.spinesL11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body11.addChild(spinesL11);
        this.spinesL11.cubeList.add(new ModelBox(spinesL11, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR11 = new AdvancedModelRenderer(this);
        this.spinesR11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body11.addChild(spinesR11);
        this.spinesR11.cubeList.add(new ModelBox(spinesR11, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL12 = new AdvancedModelRenderer(this);
        this.spinesL12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addChild(spinesL12);
        this.spinesL12.cubeList.add(new ModelBox(spinesL12, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR12 = new AdvancedModelRenderer(this);
        this.spinesR12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addChild(spinesR12);
        this.spinesR12.cubeList.add(new ModelBox(spinesR12, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL13 = new AdvancedModelRenderer(this);
        this.spinesL13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body13.addChild(spinesL13);
        this.spinesL13.cubeList.add(new ModelBox(spinesL13, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR13 = new AdvancedModelRenderer(this);
        this.spinesR13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body13.addChild(spinesR13);
        this.spinesR13.cubeList.add(new ModelBox(spinesR13, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body13.addChild(body14);
        this.body14.cubeList.add(new ModelBox(body14, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL14 = new AdvancedModelRenderer(this);
        this.spinesL14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body14.addChild(spinesL14);
        this.spinesL14.cubeList.add(new ModelBox(spinesL14, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR14 = new AdvancedModelRenderer(this);
        this.spinesR14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body14.addChild(spinesR14);
        this.spinesR14.cubeList.add(new ModelBox(spinesR14, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body15 = new AdvancedModelRenderer(this);
        this.body15.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body14.addChild(body15);
        this.body15.cubeList.add(new ModelBox(body15, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL15 = new AdvancedModelRenderer(this);
        this.spinesL15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body15.addChild(spinesL15);
        this.spinesL15.cubeList.add(new ModelBox(spinesL15, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR15 = new AdvancedModelRenderer(this);
        this.spinesR15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body15.addChild(spinesR15);
        this.spinesR15.cubeList.add(new ModelBox(spinesR15, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body16 = new AdvancedModelRenderer(this);
        this.body16.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body15.addChild(body16);
        this.body16.cubeList.add(new ModelBox(body16, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL16 = new AdvancedModelRenderer(this);
        this.spinesL16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body16.addChild(spinesL16);
        this.spinesL16.cubeList.add(new ModelBox(spinesL16, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR16 = new AdvancedModelRenderer(this);
        this.spinesR16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body16.addChild(spinesR16);
        this.spinesR16.cubeList.add(new ModelBox(spinesR16, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body17 = new AdvancedModelRenderer(this);
        this.body17.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body16.addChild(body17);
        this.body17.cubeList.add(new ModelBox(body17, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL17 = new AdvancedModelRenderer(this);
        this.spinesL17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body17.addChild(spinesL17);
        this.spinesL17.cubeList.add(new ModelBox(spinesL17, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR17 = new AdvancedModelRenderer(this);
        this.spinesR17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body17.addChild(spinesR17);
        this.spinesR17.cubeList.add(new ModelBox(spinesR17, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body18 = new AdvancedModelRenderer(this);
        this.body18.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body17.addChild(body18);
        this.body18.cubeList.add(new ModelBox(body18, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL18 = new AdvancedModelRenderer(this);
        this.spinesL18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body18.addChild(spinesL18);
        this.spinesL18.cubeList.add(new ModelBox(spinesL18, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR18 = new AdvancedModelRenderer(this);
        this.spinesR18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body18.addChild(spinesR18);
        this.spinesR18.cubeList.add(new ModelBox(spinesR18, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body19 = new AdvancedModelRenderer(this);
        this.body19.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body18.addChild(body19);
        this.body19.cubeList.add(new ModelBox(body19, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL19 = new AdvancedModelRenderer(this);
        this.spinesL19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body19.addChild(spinesL19);
        this.spinesL19.cubeList.add(new ModelBox(spinesL19, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR19 = new AdvancedModelRenderer(this);
        this.spinesR19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body19.addChild(spinesR19);
        this.spinesR19.cubeList.add(new ModelBox(spinesR19, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body20 = new AdvancedModelRenderer(this);
        this.body20.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body19.addChild(body20);
        this.body20.cubeList.add(new ModelBox(body20, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL20 = new AdvancedModelRenderer(this);
        this.spinesL20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body20.addChild(spinesL20);
        this.spinesL20.cubeList.add(new ModelBox(spinesL20, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR20 = new AdvancedModelRenderer(this);
        this.spinesR20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body20.addChild(spinesR20);
        this.spinesR20.cubeList.add(new ModelBox(spinesR20, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body21 = new AdvancedModelRenderer(this);
        this.body21.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body20.addChild(body21);
        this.body21.cubeList.add(new ModelBox(body21, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL21 = new AdvancedModelRenderer(this);
        this.spinesL21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body21.addChild(spinesL21);
        this.spinesL21.cubeList.add(new ModelBox(spinesL21, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR21 = new AdvancedModelRenderer(this);
        this.spinesR21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body21.addChild(spinesR21);
        this.spinesR21.cubeList.add(new ModelBox(spinesR21, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body22 = new AdvancedModelRenderer(this);
        this.body22.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body21.addChild(body22);
        this.body22.cubeList.add(new ModelBox(body22, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL22 = new AdvancedModelRenderer(this);
        this.spinesL22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body22.addChild(spinesL22);
        this.spinesL22.cubeList.add(new ModelBox(spinesL22, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR22 = new AdvancedModelRenderer(this);
        this.spinesR22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body22.addChild(spinesR22);
        this.spinesR22.cubeList.add(new ModelBox(spinesR22, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body23 = new AdvancedModelRenderer(this);
        this.body23.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body22.addChild(body23);
        this.body23.cubeList.add(new ModelBox(body23, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL23 = new AdvancedModelRenderer(this);
        this.spinesL23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body23.addChild(spinesL23);
        this.spinesL23.cubeList.add(new ModelBox(spinesL23, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR23 = new AdvancedModelRenderer(this);
        this.spinesR23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body23.addChild(spinesR23);
        this.spinesR23.cubeList.add(new ModelBox(spinesR23, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body24 = new AdvancedModelRenderer(this);
        this.body24.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body23.addChild(body24);
        this.body24.cubeList.add(new ModelBox(body24, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL24 = new AdvancedModelRenderer(this);
        this.spinesL24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body24.addChild(spinesL24);
        this.spinesL24.cubeList.add(new ModelBox(spinesL24, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR24 = new AdvancedModelRenderer(this);
        this.spinesR24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body24.addChild(spinesR24);
        this.spinesR24.cubeList.add(new ModelBox(spinesR24, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body25 = new AdvancedModelRenderer(this);
        this.body25.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body24.addChild(body25);
        this.body25.cubeList.add(new ModelBox(body25, 0, 17, -2.99F, -2.01F, 0.0F, 6, 4, 4, 0.0F, false));

        this.spinesL25 = new AdvancedModelRenderer(this);
        this.spinesL25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body25.addChild(spinesL25);
        this.spinesL25.cubeList.add(new ModelBox(spinesL25, 22, 12, 3.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR25 = new AdvancedModelRenderer(this);
        this.spinesR25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body25.addChild(spinesR25);
        this.spinesR25.cubeList.add(new ModelBox(spinesR25, 13, 8, -5.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body26 = new AdvancedModelRenderer(this);
        this.body26.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body25.addChild(body26);
        this.body26.cubeList.add(new ModelBox(body26, 0, 17, -3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F, false));
        this.body26.cubeList.add(new ModelBox(body26, 20, 23, -2.5F, -1.5F, 4.0F, 5, 3, 1, 0.0F, false));

        this.spinesL26 = new AdvancedModelRenderer(this);
        this.spinesL26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body26.addChild(spinesL26);
        this.spinesL26.cubeList.add(new ModelBox(spinesL26, 22, 12, 3.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.spinesR26 = new AdvancedModelRenderer(this);
        this.spinesR26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body26.addChild(spinesR26);
        this.spinesR26.cubeList.add(new ModelBox(spinesR26, 13, 8, -5.0F, 0.51F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.25F, 0.0F, 5.0F);
        this.body26.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.1745F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 0, 8, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.25F, 0.0F, 5.0F);
        this.body26.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.1745F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 0, 8, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5 * 0.45F);
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
        this.head.offsetZ = -0.5F;
        this.head.offsetY = 0.78F;
        this.tentacle.rotateAngleY = -(float)Math.toRadians(10);

        EntityPrehistoricFloraWebsteroprion websteroprion = (EntityPrehistoricFloraWebsteroprion) e;

        AdvancedModelRenderer[] BodyF = {body, body2, body3, body4, body5 ,body6, body7, body8, body9, body10, body11, body12, body13, body14, body15, body16, body17, body18, body19, body20, body21, body22, body23, body24, body25, body26};

        if (websteroprion.getAnimation() != websteroprion.ATTACK_ANIMATION) {
            this.jawR1.rotateAngleY = (float) Math.toRadians(65);
            this.jawL1.rotateAngleY = (float) Math.toRadians(-65);
            this.jawR2.rotateAngleY = (float) Math.toRadians(75);
            this.jawL2.rotateAngleY = (float) Math.toRadians(-75);

            this.jawL1.offsetX = -0.1F;
            this.jawR1.offsetX = 0.1F;
            this.jawL2.offsetX = -0.1F;
            this.jawR2.offsetX = 0.1F;
        }

        tentacle.swing(0.4F, 0.6F, false, 0F, 0F, f2, 0.5F);
        tentacle.walk(0.4F, 0.4F, false, 0F, 0.2F, f2, 0.5F);

        tentacle2.swing(0.4F, -0.5F, false, 1F, -1F, f2, 0.5F);
        tentacle4.swing(0.4F, -0.5F, false, 2F, -1F, f2, 0.5F);

        tentacle3.swing(0.4F, 0.5F, false, 1F, 1F, f2, 0.5F);
        tentacle5.swing(0.4F, 0.5F, false, 2F, 1F, f2, 0.5F);

        tailL.swing(0.65F, 0.5F, false, 1F, 1F, f2, 0.5F);
        tailR.swing(0.65F, -0.5F, false, 1F, -1F, f2, 0.5F);

        double buryTickLength = websteroprion.getBuryLength();
        float burySpeedFactor = 1F;
        float buryAngleFactor = 1F;

        if (websteroprion.getBuriedTick() > 0 || websteroprion.getBuried() || websteroprion.getSwimCount() <= 0) {
            if (websteroprion.getBuried() && (websteroprion.getBuriedTick() <= 0)) {
                //We are gone!
            }
            else {
                if (websteroprion.getBuriedTick() > 0) {
                    float buryProgress = (float) ((double) websteroprion.getBuriedTick() / buryTickLength);
                    this.head.offsetZ = -0.5F + (0.5F * buryProgress);
                    this.head.offsetY = 0.85F + (3.0F * buryProgress);
                    burySpeedFactor = 1F + (buryProgress * 0.5F);
                    buryAngleFactor = 1F - buryProgress;
                    if (buryProgress <= 0.15) {
                        float bendProgress = (float) (((double) websteroprion.getBuriedTick()) / (buryTickLength * 0.15));
                        body6.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        body5.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        body4.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        body3.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        body2.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        body.rotateAngleX = bendProgress * (float) Math.toRadians(-15);
                        head.rotateAngleX = bendProgress * (float) Math.toRadians(90);
                    } else { //buryProgress > 0.15 <= 0.30
                        if (buryProgress <= 0.30) {
                            float straightenProgress = (float) (((double) websteroprion.getBuriedTick() - (buryTickLength * 0.15D)) / (buryTickLength * 0.15));
                            body6.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            body5.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            body4.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            body3.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            body2.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            body.rotateAngleX = (float) Math.toRadians(-15) + (straightenProgress * (float) Math.toRadians(15));
                            head.rotateAngleX = (float) Math.toRadians(90);
                        } else {
                            //Just lowering into the hole now:
                            head.rotateAngleX = (float) Math.toRadians(90);
                        }

                    }
                }
            }
        }

        //General wiggling:
        this.chainWave(BodyF, 0.3F * burySpeedFactor, 0.5F * buryAngleFactor, -16, f2, 0.5F * buryAngleFactor);
        this.walk(head, 0.3F * burySpeedFactor, 0.5F * buryAngleFactor, false, 2.0F, 0F, f2, 0.5F * buryAngleFactor);
        this.chainSwing(BodyF, 0.3F * burySpeedFactor, 0.5F * buryAngleFactor, -16, f2, 0.5F * buryAngleFactor);
        this.swing(head, 0.3F * burySpeedFactor, 0.5F * buryAngleFactor, false, 2.0F, 0F, f2, 0.5F * buryAngleFactor);
        this.bob(head, 0.3F, 0.07F, false, f2, 0.5F);
        body21.rotateAngleZ = (float) Math.toRadians(2);
        body22.rotateAngleZ = (float) Math.toRadians(2);
        body23.rotateAngleZ = (float) Math.toRadians(2);
        body24.rotateAngleZ = (float) Math.toRadians(2);
        body25.rotateAngleZ = (float) Math.toRadians(2);
        body26.rotateAngleZ = (float) Math.toRadians(15);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(7);

        animator.move(this.head, 0 , -0.5F, 0);
        animator.rotate(this.body8, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body7, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-5.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.startKeyframe(3);
        animator.move(head, 0, -1F, 0);
        animator.rotate(this.body8, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body7, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jawL1, (float) Math.toRadians(0), (float) Math.toRadians(-65.0), (float) Math.toRadians(0));
        animator.rotate(this.jawL1, (float) Math.toRadians(0), (float) Math.toRadians(65.0), (float) Math.toRadians(0));
        animator.rotate(this.jawL1, (float) Math.toRadians(0), (float) Math.toRadians(-70.0), (float) Math.toRadians(0));
        animator.rotate(this.jawL1, (float) Math.toRadians(0), (float) Math.toRadians(70.0), (float) Math.toRadians(0));
        animator.endKeyframe();

        animator.resetKeyframe(5);
    }
}
