package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSchinderhannes extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer flipperL;
    private final AdvancedModelRenderer flipperR;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer tailfinL;
    private final AdvancedModelRenderer tailfinR;
    private final AdvancedModelRenderer finupperL8;
    private final AdvancedModelRenderer finlowerL7;
    private final AdvancedModelRenderer finupperL7;
    private final AdvancedModelRenderer finlowerL8;
    private final AdvancedModelRenderer finupperR7;
    private final AdvancedModelRenderer finlowerR8;
    private final AdvancedModelRenderer finupperR8;
    private final AdvancedModelRenderer finlowerR7;
    private final AdvancedModelRenderer finlowerL;
    private final AdvancedModelRenderer finlowerL2;
    private final AdvancedModelRenderer finlowerL3;
    private final AdvancedModelRenderer finlowerL4;
    private final AdvancedModelRenderer finlowerL5;
    private final AdvancedModelRenderer finlowerL6;
    private final AdvancedModelRenderer finlowerR;
    private final AdvancedModelRenderer finlowerR2;
    private final AdvancedModelRenderer finlowerR3;
    private final AdvancedModelRenderer finlowerR4;
    private final AdvancedModelRenderer finlowerR5;
    private final AdvancedModelRenderer finlowerR6;
    private final AdvancedModelRenderer finupperL;
    private final AdvancedModelRenderer finupperL2;
    private final AdvancedModelRenderer finupperL3;
    private final AdvancedModelRenderer finupperL4;
    private final AdvancedModelRenderer finupperL5;
    private final AdvancedModelRenderer finupperL6;
    private final AdvancedModelRenderer finupperR;
    private final AdvancedModelRenderer finupperR2;
    private final AdvancedModelRenderer finupperR3;
    private final AdvancedModelRenderer finupperR4;
    private final AdvancedModelRenderer finupperR5;
    private final AdvancedModelRenderer finupperR6;

    public ModelSchinderhannes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -3.0F, -3.0F, 5, 3, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.75F, -3.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 9, -2.5F, -1.25F, -5.0F, 5, 3, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 20, 1.75F, -1.0F, -3.5F, 2, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 20, -3.75F, -1.0F, -3.5F, 2, 2, 2, 0.0F, false));

        this.flipperL = new AdvancedModelRenderer(this);
        this.flipperL.setRotationPoint(0.5F, 1.75F, -1.0F);
        this.head.addChild(flipperL);
        this.setRotateAngle(flipperL, 0.0F, 0.0F, 0.0873F);
        this.flipperL.cubeList.add(new ModelBox(flipperL, 13, 9, 0.0F, 0.01F, -1.0F, 10, 0, 2, 0.0F, false));

        this.flipperR = new AdvancedModelRenderer(this);
        this.flipperR.setRotationPoint(-0.5F, 1.75F, -1.0F);
        this.head.addChild(flipperR);
        this.setRotateAngle(flipperR, 0.0F, 0.0F, -0.0873F);
        this.flipperR.cubeList.add(new ModelBox(flipperR, 13, 11, -10.0F, 0.01F, -1.0F, 10, 0, 2, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.25F, 1.5F, -4.0F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.7854F, 0.0F, -0.3491F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.3491F, 0.0F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 3, -0.51F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 20, 5, -1.5F, 0.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 14, 20, -0.5F, 0.5F, -0.25F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 8, 20, -0.5F, 0.75F, -0.75F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 8, 20, -0.5F, 0.75F, -1.25F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 8, 20, -0.5F, 0.5F, -1.75F, 1, 2, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 11, 19, -1.5F, 0.0F, -0.75F, 1, 1, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 11, 19, -1.5F, 0.0F, -1.25F, 1, 1, 0, 0.0F, false));
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 11, 19, -1.25F, 0.0F, -1.75F, 1, 1, 0, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.25F, 1.5F, -4.0F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.7854F, 0.0F, 0.3491F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 22, 13, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.3491F, 0.0F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 22, 5, -0.49F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 22, 8, 0.5F, 0.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 22, 5, -0.5F, 0.5F, -0.25F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 16, 20, -0.5F, 0.75F, -0.75F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 16, 20, -0.5F, 0.75F, -1.25F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 16, 20, -0.5F, 0.5F, -1.75F, 1, 2, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 21, 0.5F, 0.0F, -0.75F, 1, 1, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 21, 0.5F, 0.0F, -1.25F, 1, 1, 0, 0.0F, false));
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 21, 0.25F, 0.0F, -1.75F, 1, 1, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 0, -2.0F, -1.5F, 0.0F, 4, 3, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 16, 20, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(spine);
        this.spine.cubeList.add(new ModelBox(spine, 14, 13, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tailfinL = new AdvancedModelRenderer(this);
        this.tailfinL.setRotationPoint(0.25F, 1.0F, 0.5F);
        this.body3.addChild(tailfinL);
        this.setRotateAngle(tailfinL, 0.0F, 0.3491F, 0.0F);
        this.tailfinL.cubeList.add(new ModelBox(tailfinL, 4, 17, 0.0F, 0.01F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfinR = new AdvancedModelRenderer(this);
        this.tailfinR.setRotationPoint(-0.25F, 1.0F, 0.5F);
        this.body3.addChild(tailfinR);
        this.setRotateAngle(tailfinR, 0.0F, -0.3491F, 0.0F);
        this.tailfinR.cubeList.add(new ModelBox(tailfinR, 0, 17, -2.0F, 0.01F, 0.0F, 2, 0, 3, 0.0F, false));

        this.finupperL8 = new AdvancedModelRenderer(this);
        this.finupperL8.setRotationPoint(2.0F, -1.5F, 1.5F);
        this.body2.addChild(finupperL8);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, -0.1745F);
        this.finupperL8.cubeList.add(new ModelBox(finupperL8, 0, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finlowerL7 = new AdvancedModelRenderer(this);
        this.finlowerL7.setRotationPoint(1.0F, 1.5F, 0.5F);
        this.body2.addChild(finlowerL7);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -0.8727F);
        this.finlowerL7.cubeList.add(new ModelBox(finlowerL7, 0, 2, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finupperL7 = new AdvancedModelRenderer(this);
        this.finupperL7.setRotationPoint(2.0F, -1.5F, 0.5F);
        this.body2.addChild(finupperL7);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, -0.3491F);
        this.finupperL7.cubeList.add(new ModelBox(finupperL7, 2, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finlowerL8 = new AdvancedModelRenderer(this);
        this.finlowerL8.setRotationPoint(1.0F, 1.5F, 1.5F);
        this.body2.addChild(finlowerL8);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -0.6981F);
        this.finlowerL8.cubeList.add(new ModelBox(finlowerL8, 0, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finupperR7 = new AdvancedModelRenderer(this);
        this.finupperR7.setRotationPoint(-2.0F, -1.5F, 0.5F);
        this.body2.addChild(finupperR7);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, 0.3491F);
        this.finupperR7.cubeList.add(new ModelBox(finupperR7, 3, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finlowerR8 = new AdvancedModelRenderer(this);
        this.finlowerR8.setRotationPoint(-1.0F, 1.5F, 1.5F);
        this.body2.addChild(finlowerR8);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 0.6981F);
        this.finlowerR8.cubeList.add(new ModelBox(finlowerR8, 15, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finupperR8 = new AdvancedModelRenderer(this);
        this.finupperR8.setRotationPoint(-2.0F, -1.5F, 1.5F);
        this.body2.addChild(finupperR8);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, 0.1745F);
        this.finupperR8.cubeList.add(new ModelBox(finupperR8, 3, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finlowerR7 = new AdvancedModelRenderer(this);
        this.finlowerR7.setRotationPoint(-1.0F, 1.5F, 0.5F);
        this.body2.addChild(finlowerR7);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 0.8727F);
        this.finlowerR7.cubeList.add(new ModelBox(finlowerR7, 0, 17, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL = new AdvancedModelRenderer(this);
        this.finlowerL.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.body.addChild(finlowerL);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.8727F);
        this.finlowerL.cubeList.add(new ModelBox(finlowerL, 13, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL2 = new AdvancedModelRenderer(this);
        this.finlowerL2.setRotationPoint(1.0F, 0.0F, -1.5F);
        this.body.addChild(finlowerL2);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.6981F);
        this.finlowerL2.cubeList.add(new ModelBox(finlowerL2, 11, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL3 = new AdvancedModelRenderer(this);
        this.finlowerL3.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.body.addChild(finlowerL3);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.8727F);
        this.finlowerL3.cubeList.add(new ModelBox(finlowerL3, 16, 4, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL4 = new AdvancedModelRenderer(this);
        this.finlowerL4.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.body.addChild(finlowerL4);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.6981F);
        this.finlowerL4.cubeList.add(new ModelBox(finlowerL4, 16, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL5 = new AdvancedModelRenderer(this);
        this.finlowerL5.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.body.addChild(finlowerL5);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.8727F);
        this.finlowerL5.cubeList.add(new ModelBox(finlowerL5, 0, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerL6 = new AdvancedModelRenderer(this);
        this.finlowerL6.setRotationPoint(1.0F, 0.0F, 2.5F);
        this.body.addChild(finlowerL6);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -0.6981F);
        this.finlowerL6.cubeList.add(new ModelBox(finlowerL6, 0, 3, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR = new AdvancedModelRenderer(this);
        this.finlowerR.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.body.addChild(finlowerR);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.8727F);
        this.finlowerR.cubeList.add(new ModelBox(finlowerR, 17, 17, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR2 = new AdvancedModelRenderer(this);
        this.finlowerR2.setRotationPoint(-1.0F, 0.0F, -1.5F);
        this.body.addChild(finlowerR2);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.6981F);
        this.finlowerR2.cubeList.add(new ModelBox(finlowerR2, 17, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR3 = new AdvancedModelRenderer(this);
        this.finlowerR3.setRotationPoint(-1.0F, 0.0F, -0.5F);
        this.body.addChild(finlowerR3);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.8727F);
        this.finlowerR3.cubeList.add(new ModelBox(finlowerR3, 15, 17, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR4 = new AdvancedModelRenderer(this);
        this.finlowerR4.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.body.addChild(finlowerR4);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.6981F);
        this.finlowerR4.cubeList.add(new ModelBox(finlowerR4, 13, 17, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR5 = new AdvancedModelRenderer(this);
        this.finlowerR5.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.body.addChild(finlowerR5);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.8727F);
        this.finlowerR5.cubeList.add(new ModelBox(finlowerR5, 17, 12, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finlowerR6 = new AdvancedModelRenderer(this);
        this.finlowerR6.setRotationPoint(-1.0F, 0.0F, 2.5F);
        this.body.addChild(finlowerR6);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 0.6981F);
        this.finlowerR6.cubeList.add(new ModelBox(finlowerR6, 11, 17, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finupperL = new AdvancedModelRenderer(this);
        this.finupperL.setRotationPoint(2.5F, -3.0F, -2.5F);
        this.body.addChild(finupperL);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, -0.3491F);
        this.finupperL.cubeList.add(new ModelBox(finupperL, 15, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperL2 = new AdvancedModelRenderer(this);
        this.finupperL2.setRotationPoint(2.5F, -3.0F, -1.5F);
        this.body.addChild(finupperL2);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, -0.1745F);
        this.finupperL2.cubeList.add(new ModelBox(finupperL2, 14, 13, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperL3 = new AdvancedModelRenderer(this);
        this.finupperL3.setRotationPoint(2.5F, -3.0F, -0.5F);
        this.body.addChild(finupperL3);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, -0.3491F);
        this.finupperL3.cubeList.add(new ModelBox(finupperL3, 2, 13, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperL4 = new AdvancedModelRenderer(this);
        this.finupperL4.setRotationPoint(2.5F, -3.0F, 0.5F);
        this.body.addChild(finupperL4);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, -0.1745F);
        this.finupperL4.cubeList.add(new ModelBox(finupperL4, 0, 13, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperL5 = new AdvancedModelRenderer(this);
        this.finupperL5.setRotationPoint(2.5F, -3.0F, 1.5F);
        this.body.addChild(finupperL5);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, -0.3491F);
        this.finupperL5.cubeList.add(new ModelBox(finupperL5, 2, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperL6 = new AdvancedModelRenderer(this);
        this.finupperL6.setRotationPoint(2.5F, -3.0F, 2.5F);
        this.body.addChild(finupperL6);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, -0.1745F);
        this.finupperL6.cubeList.add(new ModelBox(finupperL6, 0, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR = new AdvancedModelRenderer(this);
        this.finupperR.setRotationPoint(-2.5F, -3.0F, -2.5F);
        this.body.addChild(finupperR);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, 0.3491F);
        this.finupperR.cubeList.add(new ModelBox(finupperR, 2, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR2 = new AdvancedModelRenderer(this);
        this.finupperR2.setRotationPoint(-2.5F, -3.0F, -1.5F);
        this.body.addChild(finupperR2);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, 0.1745F);
        this.finupperR2.cubeList.add(new ModelBox(finupperR2, 0, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR3 = new AdvancedModelRenderer(this);
        this.finupperR3.setRotationPoint(-2.5F, -3.0F, -0.5F);
        this.body.addChild(finupperR3);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, 0.3491F);
        this.finupperR3.cubeList.add(new ModelBox(finupperR3, 2, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR4 = new AdvancedModelRenderer(this);
        this.finupperR4.setRotationPoint(-2.5F, -3.0F, 0.5F);
        this.body.addChild(finupperR4);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, 0.1745F);
        this.finupperR4.cubeList.add(new ModelBox(finupperR4, 0, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR5 = new AdvancedModelRenderer(this);
        this.finupperR5.setRotationPoint(-2.5F, -3.0F, 1.5F);
        this.body.addChild(finupperR5);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, 0.3491F);
        this.finupperR5.cubeList.add(new ModelBox(finupperR5, 3, 4, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finupperR6 = new AdvancedModelRenderer(this);
        this.finupperR6.setRotationPoint(-2.5F, -3.0F, 2.5F);
        this.body.addChild(finupperR6);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, 0.1745F);
        this.finupperR6.cubeList.add(new ModelBox(finupperR6, 3, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.18F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.013F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 1.2F;

        AdvancedModelRenderer[] Tail = {this.body3, this.spine};

        AdvancedModelRenderer[] LAppendage = {this.appendageL, this.appendageL2};
        AdvancedModelRenderer[] RAppendage = {this.appendageR, this.appendageR2};

        AdvancedModelRenderer[] finL = {this.flipperL};
        AdvancedModelRenderer[] finR = {this.flipperR};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(LAppendage, 0.3F, -0.2F, 1, f2, 0.5F);
            this.chainWave(RAppendage, 0.3F, -0.2F, 1, f2, 0.5F);

            float paddleVdegree = -0.08F;
            float paddleHdegree = 0.25F;
            this.chainSwing(finL, speed, -paddleHdegree, -3, f2, 0.5F);
            this.chainWave(finL, speed, paddleVdegree, -3, f2, 0.5F);
            this.chainSwing(finR, speed, paddleHdegree, -3, f2, 0.5F);
            this.chainWave(finR, speed, paddleVdegree, -3, f2, 0.5F);

            float tailVdegree = 0.1F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(Tail, speed, tailHdegree, -2.5, f2, 0.5F);

            this.flap(finupperL8, 0.5F, -0.6F, false, 0, -0.5F, f2, 0.7F);
            this.flap(finupperR8, 0.5F, 0.6F, false, 0, 0.5F, f2, 0.7F);
            this.flap(finupperL7, 0.5F, -0.6F, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(finupperR7, 0.5F, 0.6F, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(finupperL6, 0.5F, -0.6F, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(finupperR6, 0.5F, 0.6F, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finupperL5, 0.5F, -0.6F, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finupperR5, 0.5F, 0.6F, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finupperL4, 0.5F, -0.6F, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finupperR4, 0.5F, 0.6F, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finupperL3, 0.5F, -0.6F, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finupperR3, 0.5F, 0.6F, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(finupperL2, 0.5F, -0.6F, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finupperR2, 0.5F, 0.6F, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finupperL, 0.5F, -0.6F, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finupperR, 0.5F, 0.6F, false, 3.5F, 0.5F, f2, 0.7F);

            this.flap(finlowerL6, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(finlowerR6, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(finlowerL5, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(finlowerR5, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(finlowerL4, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(finlowerR4, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(finlowerL3, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(finlowerR3, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(finlowerL2, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(finlowerR2, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(finlowerL, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(finlowerR, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);

            if (!e.isInWater()) {
                this.bob(body, -speed * 1.5F, 3F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }
            }
        }
    }
}
