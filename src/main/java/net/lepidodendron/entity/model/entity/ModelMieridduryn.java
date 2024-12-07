package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMieridduryn extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer jawright;
    private final AdvancedModelRenderer jawleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finright1;
    private final AdvancedModelRenderer finleft1;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer finright2;
    private final AdvancedModelRenderer finleft2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finright3;
    private final AdvancedModelRenderer finleft3;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer finright4;
    private final AdvancedModelRenderer finleft4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finright5;
    private final AdvancedModelRenderer finleft5;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer finright6;
    private final AdvancedModelRenderer finleft6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer finright7;
    private final AdvancedModelRenderer finleft7;
    private final AdvancedModelRenderer finright8;
    private final AdvancedModelRenderer finleft8;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;

    public ModelMieridduryn() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.25F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 4, 3, -0.75F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 4, 3, -0.25F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 5, 5, -0.5F, -0.025F, -1.0F, 1, 0, 1, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(proboscis);
        this.setRotateAngle(proboscis, 0.1745F, 0.0F, 0.0F);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 0, 4, 0.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.jawright = new AdvancedModelRenderer(this);
        this.jawright.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.proboscis.addChild(jawright);
        this.setRotateAngle(jawright, 0.0F, 0.5236F, 0.0F);
        this.jawright.cubeList.add(new ModelBox(jawright, 0, 0, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.jawleft = new AdvancedModelRenderer(this);
        this.jawleft.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.proboscis.addChild(jawleft);
        this.setRotateAngle(jawleft, 0.0F, -0.5236F, 0.0F);
        this.jawleft.cubeList.add(new ModelBox(jawleft, 0, 0, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 3, -0.75F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 3, -0.25F, -0.5F, 0.0F, 1, 1, 2, 0.002F, true));

        this.finright1 = new AdvancedModelRenderer(this);
        this.finright1.setRotationPoint(-0.75F, 0.0F, 0.5F);
        this.body2.addChild(finright1);
        this.finright1.cubeList.add(new ModelBox(finright1, 5, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft1 = new AdvancedModelRenderer(this);
        this.finleft1.setRotationPoint(0.75F, 0.0F, 0.5F);
        this.body2.addChild(finleft1);
        this.finleft1.cubeList.add(new ModelBox(finleft1, 5, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-0.75F, 0.25F, 0.5F);
        this.body2.addChild(legright1);
        this.setRotateAngle(legright1, 0.0F, 0.0F, -0.6981F);
        this.legright1.cubeList.add(new ModelBox(legright1, 0, 3, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(0.75F, 0.25F, 0.5F);
        this.body2.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0F, 0.0F, 0.6981F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 0, 3, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.75F, 0.25F, 1.5F);
        this.body2.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, -0.6981F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 0, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.75F, 0.25F, 1.5F);
        this.body2.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, 0.6981F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 0, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.finright2 = new AdvancedModelRenderer(this);
        this.finright2.setRotationPoint(-0.75F, 0.0F, 1.5F);
        this.body2.addChild(finright2);
        this.finright2.cubeList.add(new ModelBox(finright2, 5, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft2 = new AdvancedModelRenderer(this);
        this.finleft2.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.body2.addChild(finleft2);
        this.finleft2.cubeList.add(new ModelBox(finleft2, 5, 1, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 3, -0.75F, -0.5F, 0.0F, 1, 1, 2, -0.001F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 3, -0.25F, -0.5F, 0.0F, 1, 1, 2, 0.001F, true));

        this.finright3 = new AdvancedModelRenderer(this);
        this.finright3.setRotationPoint(-0.75F, 0.0F, 0.5F);
        this.body3.addChild(finright3);
        this.finright3.cubeList.add(new ModelBox(finright3, 5, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft3 = new AdvancedModelRenderer(this);
        this.finleft3.setRotationPoint(0.75F, 0.0F, 0.5F);
        this.body3.addChild(finleft3);
        this.finleft3.cubeList.add(new ModelBox(finleft3, 5, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.75F, 0.25F, 0.5F);
        this.body3.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.6981F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 3, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.75F, 0.25F, 0.5F);
        this.body3.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.6981F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 3, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.75F, 0.25F, 1.5F);
        this.body3.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0F, -0.6981F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 0, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.75F, 0.25F, 1.5F);
        this.body3.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.0F, 0.6981F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 0, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.finright4 = new AdvancedModelRenderer(this);
        this.finright4.setRotationPoint(-0.75F, 0.0F, 1.5F);
        this.body3.addChild(finright4);
        this.finright4.cubeList.add(new ModelBox(finright4, 5, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft4 = new AdvancedModelRenderer(this);
        this.finleft4.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.body3.addChild(finleft4);
        this.finleft4.cubeList.add(new ModelBox(finleft4, 5, 1, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 3, -0.75F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 3, -0.25F, -0.5F, 0.0F, 1, 1, 2, 0.002F, true));

        this.finright5 = new AdvancedModelRenderer(this);
        this.finright5.setRotationPoint(-0.75F, 0.0F, 0.5F);
        this.body4.addChild(finright5);
        this.finright5.cubeList.add(new ModelBox(finright5, 5, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft5 = new AdvancedModelRenderer(this);
        this.finleft5.setRotationPoint(0.75F, 0.0F, 0.5F);
        this.body4.addChild(finleft5);
        this.finleft5.cubeList.add(new ModelBox(finleft5, 5, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.75F, 0.25F, 0.5F);
        this.body4.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.0F, -0.6981F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 3, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.75F, 0.25F, 0.5F);
        this.body4.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, 0.0F, 0.6981F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 3, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.75F, 0.25F, 1.5F);
        this.body4.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.0F, -0.6981F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 0, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.75F, 0.25F, 1.5F);
        this.body4.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, 0.0F, 0.6981F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 0, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.finright6 = new AdvancedModelRenderer(this);
        this.finright6.setRotationPoint(-0.75F, 0.0F, 1.5F);
        this.body4.addChild(finright6);
        this.finright6.cubeList.add(new ModelBox(finright6, 5, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft6 = new AdvancedModelRenderer(this);
        this.finleft6.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.body4.addChild(finleft6);
        this.finleft6.cubeList.add(new ModelBox(finleft6, 5, 1, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 3, 1, -0.5F, 0.0F, 2.0F, 1, 0, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 3, 0, -1.0F, 0.0F, 3.0F, 2, 0, 1, 0.0F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-0.75F, 0.25F, 0.5F);
        this.body5.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.0F, -0.6981F);
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 3, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(0.75F, 0.25F, 0.5F);
        this.body5.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, 0.0F, 0.6981F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 3, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.finright7 = new AdvancedModelRenderer(this);
        this.finright7.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body5.addChild(finright7);
        this.finright7.cubeList.add(new ModelBox(finright7, 5, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft7 = new AdvancedModelRenderer(this);
        this.finleft7.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body5.addChild(finleft7);
        this.finleft7.cubeList.add(new ModelBox(finleft7, 5, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.finright8 = new AdvancedModelRenderer(this);
        this.finright8.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body5.addChild(finright8);
        this.finright8.cubeList.add(new ModelBox(finright8, 5, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft8 = new AdvancedModelRenderer(this);
        this.finleft8.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body5.addChild(finleft8);
        this.finleft8.cubeList.add(new ModelBox(finleft8, 5, 1, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-0.75F, 0.25F, 1.5F);
        this.body5.addChild(legright8);
        this.setRotateAngle(legright8, 0.0F, 0.0F, -0.6981F);
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 0, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(0.75F, 0.25F, 1.5F);
        this.body5.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0F, 0.0F, 0.6981F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 0, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.2F);
        this.setRotateAngle(body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.3F, 0.0F, 0.0F);
        this.body.offsetZ = -0.0F;
        this.body.offsetY = -0.15F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.7F;
        this.body.offsetX = 0.8F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.2F, 3.5F, 0.3F);
        this.setRotateAngle(body2, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.5F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
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
        this.body.offsetY = 0.0F;

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
            //this.body.offsetY = 1.08F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(jawleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.swing(jawright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(proboscis, 0.3F, 0.1F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.15F;
            float tailHdegree = 0.3F;
            this.chainSwing(Tail, speed*0.65F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.35F;
            this.flap(legleft1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legright1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legleft4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legright4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legleft5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legright5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(legleft6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(legright6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(legleft7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(legright7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(legleft8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(legright8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);


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
