package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPygocephalomorpha;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelTealliocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pleopodright1;
    private final AdvancedModelRenderer pleopodleft1;
    private final AdvancedModelRenderer pleopodright2;
    private final AdvancedModelRenderer pleopodleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pleopodright3;
    private final AdvancedModelRenderer pleopodleft3;
    private final AdvancedModelRenderer pleopodright4;
    private final AdvancedModelRenderer pleopodleft4;
    private final AdvancedModelRenderer pleopodright5;
    private final AdvancedModelRenderer pleopodleft5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legsmallright;
    private final AdvancedModelRenderer legsmallleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright2;
    private final AdvancedModelRenderer antennaleft2;

    private ModelAnimator animator;


    public ModelTealliocaris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.8073F, -0.0506F);
        this.base.cubeList.add(new ModelBox(base, 14, 11, -0.5F, -2.8073F, -3.6994F, 1, 1, 4, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 14, 11, -0.5F, -2.3073F, -3.6994F, 1, 1, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 11, -2.0F, -2.8073F, -1.6994F, 4, 2, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 12, 16, -1.5F, -2.8073F, -3.6994F, 3, 1, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 10, 19, -1.5F, -2.3073F, -3.6994F, 3, 1, 2, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 22, 16, -1.1F, -1.5073F, -5.6994F, 1, 0, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 22, 16, 0.1F, -1.5073F, -5.6994F, 1, 0, 2, 0.0F, true));
        this.base.cubeList.add(new ModelBox(base, 26, 24, -1.525F, -2.7823F, -4.1994F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 26, 24, 0.525F, -2.7823F, -4.1994F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8073F, -3.2994F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 26, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.7823F, 0.3006F);
        this.base.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 19, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 22, -1.5F, 0.75F, 0.0F, 3, 1, 2, 0.01F, false));

        this.pleopodright1 = new AdvancedModelRenderer(this);
        this.pleopodright1.setRotationPoint(-0.9F, 1.75F, 0.5F);
        this.body.addChild(pleopodright1);
        this.setRotateAngle(pleopodright1, 0.4363F, 0.0F, 0.0F);
        this.pleopodright1.cubeList.add(new ModelBox(pleopodright1, 22, 18, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.pleopodleft1 = new AdvancedModelRenderer(this);
        this.pleopodleft1.setRotationPoint(0.9F, 1.75F, 0.5F);
        this.body.addChild(pleopodleft1);
        this.setRotateAngle(pleopodleft1, 0.4363F, 0.0F, 0.0F);
        this.pleopodleft1.cubeList.add(new ModelBox(pleopodleft1, 22, 18, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.pleopodright2 = new AdvancedModelRenderer(this);
        this.pleopodright2.setRotationPoint(-0.9F, 1.75F, 1.5F);
        this.body.addChild(pleopodright2);
        this.setRotateAngle(pleopodright2, 0.4363F, 0.0F, 0.0F);
        this.pleopodright2.cubeList.add(new ModelBox(pleopodright2, 24, 15, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.pleopodleft2 = new AdvancedModelRenderer(this);
        this.pleopodleft2.setRotationPoint(0.9F, 1.75F, 1.5F);
        this.body.addChild(pleopodleft2);
        this.setRotateAngle(pleopodleft2, 0.4363F, 0.0F, 0.0F);
        this.pleopodleft2.cubeList.add(new ModelBox(pleopodleft2, 24, 15, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.2618F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 20, 19, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, -1.5F, 0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.pleopodright3 = new AdvancedModelRenderer(this);
        this.pleopodright3.setRotationPoint(-0.9F, 1.5F, 0.4F);
        this.body2.addChild(pleopodright3);
        this.setRotateAngle(pleopodright3, 0.4363F, 0.0F, 0.0F);
        this.pleopodright3.cubeList.add(new ModelBox(pleopodright3, 24, 18, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.pleopodleft3 = new AdvancedModelRenderer(this);
        this.pleopodleft3.setRotationPoint(0.9F, 1.5F, 0.4F);
        this.body2.addChild(pleopodleft3);
        this.setRotateAngle(pleopodleft3, 0.4363F, 0.0F, 0.0F);
        this.pleopodleft3.cubeList.add(new ModelBox(pleopodleft3, 24, 18, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.pleopodright4 = new AdvancedModelRenderer(this);
        this.pleopodright4.setRotationPoint(-0.9F, 1.5F, 1.15F);
        this.body2.addChild(pleopodright4);
        this.setRotateAngle(pleopodright4, 0.4363F, 0.0F, 0.0F);
        this.pleopodright4.cubeList.add(new ModelBox(pleopodright4, 18, 25, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.pleopodleft4 = new AdvancedModelRenderer(this);
        this.pleopodleft4.setRotationPoint(0.9F, 1.5F, 1.15F);
        this.body2.addChild(pleopodleft4);
        this.setRotateAngle(pleopodleft4, 0.4363F, 0.0F, 0.0F);
        this.pleopodleft4.cubeList.add(new ModelBox(pleopodleft4, 18, 25, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.pleopodright5 = new AdvancedModelRenderer(this);
        this.pleopodright5.setRotationPoint(-0.9F, 1.5F, 1.9F);
        this.body2.addChild(pleopodright5);
        this.setRotateAngle(pleopodright5, 0.4363F, 0.0F, 0.0F);
        this.pleopodright5.cubeList.add(new ModelBox(pleopodright5, 26, 15, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.pleopodleft5 = new AdvancedModelRenderer(this);
        this.pleopodleft5.setRotationPoint(0.9F, 1.5F, 1.9F);
        this.body2.addChild(pleopodleft5);
        this.setRotateAngle(pleopodleft5, 0.4363F, 0.0F, 0.0F);
        this.pleopodleft5.cubeList.add(new ModelBox(pleopodleft5, 26, 15, -0.5F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3927F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 6, 25, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 25, -0.5F, 0.0F, 1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.55F, 0.05F, 1.0F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 22, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.275F, 0.025F, 1.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 26, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.55F, 0.05F, 1.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 22, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.275F, 0.025F, 1.0F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 26, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.legsmallright = new AdvancedModelRenderer(this);
        this.legsmallright.setRotationPoint(-0.5F, -1.8073F, -1.7994F);
        this.base.addChild(legsmallright);
        this.setRotateAngle(legsmallright, 0.0F, -1.0036F, -0.3491F);
        this.legsmallright.cubeList.add(new ModelBox(legsmallright, 0, 27, -1.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legsmallleft = new AdvancedModelRenderer(this);
        this.legsmallleft.setRotationPoint(0.5F, -1.8073F, -1.7994F);
        this.base.addChild(legsmallleft);
        this.setRotateAngle(legsmallleft, 0.0F, 1.0036F, 0.3491F);
        this.legsmallleft.cubeList.add(new ModelBox(legsmallleft, 0, 27, -0.5F, -0.5F, 0.0F, 2, 2, 0, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.4F, -1.8073F, -1.2994F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.8727F, -0.5236F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 22, -2.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.4F, -1.8073F, -1.2994F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.8727F, 0.5236F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 22, -0.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.4F, -1.8073F, -1.0494F);
        this.base.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.3927F, -0.48F);
        this.legright2.cubeList.add(new ModelBox(legright2, 24, 11, -2.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.4F, -1.8073F, -1.0494F);
        this.base.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.3927F, 0.48F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 24, 11, -0.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.075F, -1.8073F, -0.7994F);
        this.base.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.0873F, -0.3491F);
        this.legright3.cubeList.add(new ModelBox(legright3, 24, 13, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(-0.075F, -1.8073F, -0.7994F);
        this.base.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0873F, 0.3491F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 24, 13, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.425F, -1.8073F, -0.4494F);
        this.base.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0436F, -0.4363F);
        this.legright4.cubeList.add(new ModelBox(legright4, 20, 24, -2.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.425F, -1.8073F, -0.4494F);
        this.base.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.0436F, 0.4363F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 20, 24, -0.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.425F, -1.8073F, 0.0006F);
        this.base.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.1745F, -0.4363F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 25, -2.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.425F, -1.8073F, 0.0006F);
        this.base.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.1745F, 0.4363F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 25, -0.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.9F, -1.3573F, -3.5994F);
        this.base.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.2182F, 0.0F, -0.1309F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 3, 3, -4.5F, 0.0F, -2.0F, 5, 0, 8, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.9F, -1.3573F, -3.5994F);
        this.base.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.2182F, 0.0F, 0.1309F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 3, 3, -0.5F, 0.0F, -2.0F, 5, 0, 8, 0.0F, true));

        this.antennaright2 = new AdvancedModelRenderer(this);
        this.antennaright2.setRotationPoint(0.0F, -1.7073F, -3.5994F);
        this.base.addChild(antennaright2);
        this.setRotateAngle(antennaright2, -0.0873F, 0.4363F, -0.1745F);
        this.antennaright2.cubeList.add(new ModelBox(antennaright2, 0, 16, -2.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.antennaleft2 = new AdvancedModelRenderer(this);
        this.antennaleft2.setRotationPoint(0.0F, -1.7073F, -3.5994F);
        this.base.addChild(antennaleft2);
        this.setRotateAngle(antennaleft2, -0.0873F, -0.4363F, 0.1745F);
        this.antennaleft2.cubeList.add(new ModelBox(antennaleft2, 0, 16, -1.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.03F;
        this.base.offsetY = 0.04F;
        this.base.offsetX = -0.0F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.base.offsetZ = 0.030F;
        this.base.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = 0.4F;
        this.base.offsetX = 0.2F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 5.0F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, -0.2F, 3.0F, -0.05F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(body3, -0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.carapace.offsetY = -0.2F;
        //this.carapace.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.body, this.body2, this.body3};
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};



        //mouthparts:
        //this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraPygocephalomorpha slimon = (EntityPrehistoricFloraPygocephalomorpha) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPygocephalomorpha ee = (EntityPrehistoricFloraPygocephalomorpha) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                //Walk pose:
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
            else { //in water but not moving:
//                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
//                    //Walk static pose:
//                    animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
//                }
            }
        }
    }
    

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPygocephalomorpha entity = (EntityPrehistoricFloraPygocephalomorpha) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-0))*2), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(7.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodright1, pleopodright1.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), pleopodright1.rotateAngleY + (float) Math.toRadians(0), pleopodright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodleft1, pleopodleft1.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), pleopodleft1.rotateAngleY + (float) Math.toRadians(0), pleopodleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodright2, pleopodright2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodright2.rotateAngleY + (float) Math.toRadians(0), pleopodright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodleft2, pleopodleft2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodleft2.rotateAngleY + (float) Math.toRadians(0), pleopodleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(7.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodright3, pleopodright3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodright3.rotateAngleY + (float) Math.toRadians(0), pleopodright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodleft3, pleopodleft3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodleft3.rotateAngleY + (float) Math.toRadians(0), pleopodleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodright4, pleopodright4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodright4.rotateAngleY + (float) Math.toRadians(0), pleopodright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodleft4, pleopodleft4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodleft4.rotateAngleY + (float) Math.toRadians(0), pleopodleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodright5, pleopodright5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodright5.rotateAngleY + (float) Math.toRadians(0), pleopodright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodleft5, pleopodleft5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodleft5.rotateAngleY + (float) Math.toRadians(0), pleopodleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(7.5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legsmallright, legsmallright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+30))*2), legsmallright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*4), legsmallright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legsmallleft, legsmallleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-30))*2), legsmallleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*4), legsmallleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*2), legright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*4), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-115))*2), legleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*4), legleft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.19421-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.06847-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.51466 + (((tickAnim - 5) / 5) * (8.46186-(5.51466)));
            yy = -12.19421 + (((tickAnim - 5) / 5) * (-15.70935-(-12.19421)));
            zz = 17.06847 + (((tickAnim - 5) / 5) * (-8.42763-(17.06847)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.46186 + (((tickAnim - 10) / 10) * (0-(8.46186)));
            yy = -15.70935 + (((tickAnim - 10) / 10) * (0-(-15.70935)));
            zz = -8.42763 + (((tickAnim - 10) / 10) * (0-(-8.42763)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-12.19421-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (17.06847-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5.51466 + (((tickAnim - 25) / 5) * (8.46186-(5.51466)));
            yy = -12.19421 + (((tickAnim - 25) / 5) * (-15.70935-(-12.19421)));
            zz = 17.06847 + (((tickAnim - 25) / 5) * (-8.42763-(17.06847)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.46186 + (((tickAnim - 30) / 10) * (0-(8.46186)));
            yy = -15.70935 + (((tickAnim - 30) / 10) * (0-(-15.70935)));
            zz = -8.42763 + (((tickAnim - 30) / 10) * (0-(-8.42763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.48 + (((tickAnim - 0) / 2) * (8.46186-(7.48)));
            yy = 14.54 + (((tickAnim - 0) / 2) * (15.70935-(14.54)));
            zz = -0.07 + (((tickAnim - 0) / 2) * (8.42763-(-0.07)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 8.46186 + (((tickAnim - 2) / 10) * (0-(8.46186)));
            yy = 15.70935 + (((tickAnim - 2) / 10) * (0-(15.70935)));
            zz = 8.42763 + (((tickAnim - 2) / 10) * (0-(8.42763)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (12.19421-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-17.06847-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 5.51466 + (((tickAnim - 17) / 5) * (8.46186-(5.51466)));
            yy = 12.19421 + (((tickAnim - 17) / 5) * (15.70935-(12.19421)));
            zz = -17.06847 + (((tickAnim - 17) / 5) * (8.42763-(-17.06847)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 8.46186 + (((tickAnim - 22) / 10) * (0-(8.46186)));
            yy = 15.70935 + (((tickAnim - 22) / 10) * (0-(15.70935)));
            zz = 8.42763 + (((tickAnim - 22) / 10) * (0-(8.42763)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (12.19421-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-17.06847-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5.51466 + (((tickAnim - 37) / 3) * (7.48-(5.51466)));
            yy = 12.19421 + (((tickAnim - 37) / 3) * (14.54-(12.19421)));
            zz = -17.06847 + (((tickAnim - 37) / 3) * (-0.07-(-17.06847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.35 + (((tickAnim - 0) / 3) * (4.95152-(2.35)));
            yy = -8.37 + (((tickAnim - 0) / 3) * (-16.52155-(-8.37)));
            zz = 12.37 + (((tickAnim - 0) / 3) * (-5.34502-(12.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 4.95152 + (((tickAnim - 3) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 3) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 3) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.2945 + (((tickAnim - 13) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 13) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 13) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.05027 + (((tickAnim - 18) / 5) * (4.95152-(1.05027)));
            yy = -4.29822 + (((tickAnim - 18) / 5) * (-16.52155-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 18) / 5) * (-5.34502-(21.22451)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.95152 + (((tickAnim - 23) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 23) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 23) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.2945 + (((tickAnim - 33) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 33) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 33) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.05027 + (((tickAnim - 38) / 2) * (2.35-(1.05027)));
            yy = -4.29822 + (((tickAnim - 38) / 2) * (-8.37-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 38) / 2) * (12.37-(21.22451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.83 + (((tickAnim - 0) / 5) * (-3.2945-(0.83)));
            yy = -0.15 + (((tickAnim - 0) / 5) * (-16.83111-(-0.15)));
            zz = 0.78 + (((tickAnim - 0) / 5) * (-3.79181-(0.78)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.2945 + (((tickAnim - 5) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 5) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 5) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.05027 + (((tickAnim - 10) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 10) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 10) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.95152 + (((tickAnim - 15) / 10) * (-3.2945-(4.95152)));
            yy = 16.52155 + (((tickAnim - 15) / 10) * (-16.83111-(16.52155)));
            zz = 5.34502 + (((tickAnim - 15) / 10) * (-3.79181-(5.34502)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.2945 + (((tickAnim - 25) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 25) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 25) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.05027 + (((tickAnim - 30) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 30) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 30) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.95152 + (((tickAnim - 35) / 5) * (0.83-(4.95152)));
            yy = 16.52155 + (((tickAnim - 35) / 5) * (-0.15-(16.52155)));
            zz = 5.34502 + (((tickAnim - 35) / 5) * (0.78-(5.34502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.57 + (((tickAnim - 0) / 2) * (-2.57129-(-1.57)));
            yy = 11.34 + (((tickAnim - 0) / 2) * (16.96639-(11.34)));
            zz = 1.77 + (((tickAnim - 0) / 2) * (2.85264-(1.77)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -2.57129 + (((tickAnim - 2) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 2) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 2) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.37046 + (((tickAnim - 7) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 7) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 7) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.4427 + (((tickAnim - 12) / 10) * (-2.57129-(3.4427)));
            yy = -16.79985 + (((tickAnim - 12) / 10) * (16.96639-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 12) / 10) * (2.85264-(-3.64399)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -2.57129 + (((tickAnim - 22) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 22) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 22) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0.37046 + (((tickAnim - 27) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 27) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 27) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.4427 + (((tickAnim - 32) / 8) * (-1.57-(3.4427)));
            yy = -16.79985 + (((tickAnim - 32) / 8) * (11.34-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 32) / 8) * (1.77-(-3.64399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.39 + (((tickAnim - 0) / 3) * (3.4427-(1.39)));
            yy = 8.52 + (((tickAnim - 0) / 3) * (16.79985-(8.52)));
            zz = -13.22 + (((tickAnim - 0) / 3) * (3.64399-(-13.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 3.4427 + (((tickAnim - 3) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 3) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 3) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.57129 + (((tickAnim - 13) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 13) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 13) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.37046 + (((tickAnim - 18) / 5) * (3.4427-(0.37046)));
            yy = 4.37439 + (((tickAnim - 18) / 5) * (16.79985-(4.37439)));
            zz = -21.65911 + (((tickAnim - 18) / 5) * (3.64399-(-21.65911)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3.4427 + (((tickAnim - 23) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 23) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 23) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.57129 + (((tickAnim - 33) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 33) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 33) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.37046 + (((tickAnim - 38) / 2) * (1.39-(0.37046)));
            yy = 4.37439 + (((tickAnim - 38) / 2) * (8.52-(4.37439)));
            zz = -21.65911 + (((tickAnim - 38) / 2) * (-13.22-(-21.65911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.18624 + (((tickAnim - 0) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 0) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 0) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.63788 + (((tickAnim - 5) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 5) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 5) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.86371 + (((tickAnim - 15) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 15) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 15) / 5) * (21.50803-(0.73038)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.18624 + (((tickAnim - 20) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 20) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 20) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.63788 + (((tickAnim - 25) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 25) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 25) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.86371 + (((tickAnim - 35) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 35) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 35) / 5) * (21.50803-(0.73038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.47 + (((tickAnim - 0) / 7) * (-4.86371-(1.47)));
            yy = 5.49 + (((tickAnim - 0) / 7) * (-16.67917-(5.49)));
            zz = 1.14 + (((tickAnim - 0) / 7) * (-0.73038-(1.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.86371 + (((tickAnim - 7) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 7) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 7) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0.18624 + (((tickAnim - 12) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 12) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 12) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 4.63788 + (((tickAnim - 17) / 10) * (-4.86371-(4.63788)));
            yy = 16.57347 + (((tickAnim - 17) / 10) * (-16.67917-(16.57347)));
            zz = 2.07666 + (((tickAnim - 17) / 10) * (-0.73038-(2.07666)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.86371 + (((tickAnim - 27) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 27) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 27) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0.18624 + (((tickAnim - 32) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 32) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 32) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 4.63788 + (((tickAnim - 37) / 3) * (1.47-(4.63788)));
            yy = 16.57347 + (((tickAnim - 37) / 3) * (5.49-(16.57347)));
            zz = 2.07666 + (((tickAnim - 37) / 3) * (1.14-(2.07666)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5), antennaright.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5), antennaleft.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaright2, antennaright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), antennaright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+125))*2.5), antennaright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft2, antennaleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), antennaleft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*2.5), antennaleft2.rotateAngleZ + (float) Math.toRadians(0));

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPygocephalomorpha e = (EntityPrehistoricFloraPygocephalomorpha) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
