package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraParioscorpio;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;

public class ModelParioscorpio extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer leftleg6;
    private final AdvancedModelRenderer rightleg6;
    private final AdvancedModelRenderer leftleg7;
    private final AdvancedModelRenderer rightleg7;
    private final AdvancedModelRenderer leftleg8;
    private final AdvancedModelRenderer rightleg8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftleg9;
    private final AdvancedModelRenderer rightleg9;
    private final AdvancedModelRenderer leftleg10;
    private final AdvancedModelRenderer rightleg10;
    private final AdvancedModelRenderer leftleg11;
    private final AdvancedModelRenderer rightleg11;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftleg12;
    private final AdvancedModelRenderer rightleg12;
    private final AdvancedModelRenderer leftleg13;
    private final AdvancedModelRenderer rightleg13;

    public ModelParioscorpio() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.5F, -6.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 7, -3.0F, -0.9F, -2.5F, 6, 0, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 15, -1.5F, -1.025F, -2.0F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, 0.25F, -1.1F, -1.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -1.25F, -1.1F, -1.5F, 1, 1, 1, 0.0F, true));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(1.5F, -0.25F, -0.75F);
        this.head.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0F, 0.2182F, 0.2618F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 7, 15, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.5F, -0.25F, -0.75F);
        this.head.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0F, -0.2182F, -0.2618F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 7, 15, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(1.0F, -0.25F, -1.5F);
        this.head.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.0F, 0.6109F, 0.0F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 0, 4, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, 0.48F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 14, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.5F, 0.5F);
        this.leftarm2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 1.1345F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 0, 7, -0.5F, 0.0F, -0.75F, 2, 0, 1, 0.0F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-1.0F, -0.25F, -1.5F);
        this.head.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.0F, -0.6109F, 0.0F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 0, 4, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0F, -0.48F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 14, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 0.5F, 0.5F);
        this.rightarm2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, 0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, -1.1345F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 7, -1.5F, 0.0F, -0.75F, 2, 0, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 7, -2.0F, -1.0F, 0.0F, 4, 1, 7, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.5F, -0.75F, 0.0F, 7, 0, 7, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(2.0F, -0.25F, 0.5F);
        this.body1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-2.0F, -0.25F, 0.5F);
        this.body1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(2.0F, -0.25F, 1.5F);
        this.body1.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-2.0F, -0.25F, 1.5F);
        this.body1.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(2.0F, -0.25F, 2.5F);
        this.body1.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-2.0F, -0.25F, 2.5F);
        this.body1.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(2.0F, -0.25F, 3.5F);
        this.body1.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(-2.0F, -0.25F, 3.5F);
        this.body1.addChild(rightleg5);
        this.setRotateAngle(rightleg5, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg6 = new AdvancedModelRenderer(this);
        this.leftleg6.setRotationPoint(2.0F, -0.25F, 4.5F);
        this.body1.addChild(leftleg6);
        this.setRotateAngle(leftleg6, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg6.cubeList.add(new ModelBox(leftleg6, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg6 = new AdvancedModelRenderer(this);
        this.rightleg6.setRotationPoint(-2.0F, -0.25F, 4.5F);
        this.body1.addChild(rightleg6);
        this.setRotateAngle(rightleg6, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg6.cubeList.add(new ModelBox(rightleg6, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg7 = new AdvancedModelRenderer(this);
        this.leftleg7.setRotationPoint(2.0F, -0.25F, 5.5F);
        this.body1.addChild(leftleg7);
        this.setRotateAngle(leftleg7, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg7.cubeList.add(new ModelBox(leftleg7, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg7 = new AdvancedModelRenderer(this);
        this.rightleg7.setRotationPoint(-2.0F, -0.25F, 5.5F);
        this.body1.addChild(rightleg7);
        this.setRotateAngle(rightleg7, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg7.cubeList.add(new ModelBox(rightleg7, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg8 = new AdvancedModelRenderer(this);
        this.leftleg8.setRotationPoint(2.0F, -0.25F, 6.5F);
        this.body1.addChild(leftleg8);
        this.setRotateAngle(leftleg8, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg8.cubeList.add(new ModelBox(leftleg8, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg8 = new AdvancedModelRenderer(this);
        this.rightleg8.setRotationPoint(-2.0F, -0.25F, 6.5F);
        this.body1.addChild(rightleg8);
        this.setRotateAngle(rightleg8, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg8.cubeList.add(new ModelBox(rightleg8, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -1.5F, -0.975F, 0.0F, 3, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 12, 11, -3.0F, -0.725F, 0.0F, 6, 0, 3, 0.0F, false));

        this.leftleg9 = new AdvancedModelRenderer(this);
        this.leftleg9.setRotationPoint(1.5F, -0.25F, 0.5F);
        this.body2.addChild(leftleg9);
        this.setRotateAngle(leftleg9, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg9.cubeList.add(new ModelBox(leftleg9, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg9 = new AdvancedModelRenderer(this);
        this.rightleg9.setRotationPoint(-1.5F, -0.25F, 0.5F);
        this.body2.addChild(rightleg9);
        this.setRotateAngle(rightleg9, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg9.cubeList.add(new ModelBox(rightleg9, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg10 = new AdvancedModelRenderer(this);
        this.leftleg10.setRotationPoint(1.5F, -0.25F, 1.5F);
        this.body2.addChild(leftleg10);
        this.setRotateAngle(leftleg10, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg10.cubeList.add(new ModelBox(leftleg10, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg10 = new AdvancedModelRenderer(this);
        this.rightleg10.setRotationPoint(-1.5F, -0.25F, 1.5F);
        this.body2.addChild(rightleg10);
        this.setRotateAngle(rightleg10, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg10.cubeList.add(new ModelBox(rightleg10, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg11 = new AdvancedModelRenderer(this);
        this.leftleg11.setRotationPoint(1.5F, -0.25F, 2.5F);
        this.body2.addChild(leftleg11);
        this.setRotateAngle(leftleg11, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg11.cubeList.add(new ModelBox(leftleg11, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg11 = new AdvancedModelRenderer(this);
        this.rightleg11.setRotationPoint(-1.5F, -0.25F, 2.5F);
        this.body2.addChild(rightleg11);
        this.setRotateAngle(rightleg11, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg11.cubeList.add(new ModelBox(rightleg11, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -2.0F, -0.675F, 0.0F, 4, 0, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 19, -1.0F, -0.925F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 2, 0, -0.5F, -0.5F, 2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.1F, -0.65F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.1F, -0.65F, 0.0F, 1, 0, 2, 0.0F, false));

        this.leftleg12 = new AdvancedModelRenderer(this);
        this.leftleg12.setRotationPoint(1.0F, -0.25F, 0.5F);
        this.body3.addChild(leftleg12);
        this.setRotateAngle(leftleg12, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg12.cubeList.add(new ModelBox(leftleg12, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg12 = new AdvancedModelRenderer(this);
        this.rightleg12.setRotationPoint(-1.0F, -0.25F, 0.5F);
        this.body3.addChild(rightleg12);
        this.setRotateAngle(rightleg12, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg12.cubeList.add(new ModelBox(rightleg12, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg13 = new AdvancedModelRenderer(this);
        this.leftleg13.setRotationPoint(1.0F, -0.25F, 1.5F);
        this.body3.addChild(leftleg13);
        this.setRotateAngle(leftleg13, 0.2182F, -0.2618F, 0.3491F);
        this.leftleg13.cubeList.add(new ModelBox(leftleg13, 0, 6, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg13 = new AdvancedModelRenderer(this);
        this.rightleg13.setRotationPoint(-1.0F, -0.25F, 1.5F);
        this.body3.addChild(rightleg13);
        this.setRotateAngle(rightleg13, 0.2182F, 0.2618F, -0.3491F);
        this.rightleg13.cubeList.add(new ModelBox(rightleg13, 0, 6, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.head.offsetZ = 0.02F;
        this.head.offsetY = -0.2F;
        this.head.offsetX = -0.005F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.head.offsetZ = -0.020F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -0.7F;
        this.head.offsetX = 0.2F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 4.5F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(head, 0.5F, 3.5F, 0.0F);
        this.setRotateAngle(body1, 0.3F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.3F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.3F, -0.2F, 0.0F);
        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3};

        float speed = 0.3F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.5F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.05F;
        }

        AdvancedModelRenderer[] pincerL = {this.leftarm1, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] pincerR = {this.rightarm1, this.rightarm2, this.rightarm3};
        this.chainSwing(pincerL, speed * .5F, -0.3F, 0.5F, f2, 0.6F);
        this.chainSwing(pincerR, speed *  .5F, 0.3F, 0.5F, f2, 0.6F);
        //this.swing(appendageL, speed * 3F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        //this.swing(appendageR, speed * 3F, 0.7F, false, 0, -1.15F, f2, 0.5F);

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.15F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            //this.swing(Lunaspis, speed, 0.3F, true, 0, 0, f2, 1);
            this.flap(leftleg1, 0.5F, -0.4F, true, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.5F, 0.4F, true, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.5F, -0.4F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.5F, 0.4F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.5F, -0.4F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.5F, 0.4F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg4, 0.5F, -0.4F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg4, 0.5F, 0.4F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg5, 0.5F, -0.4F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg5, 0.5F, 0.4F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg6, 0.5F, -0.4F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg6, 0.5F, 0.4F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg7, 0.5F, -0.4F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg7, 0.5F, 0.4F, true, 6.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg8, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg8, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg9, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg9, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg10, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg10, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg11, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg11, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg12, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg12, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg13, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg13, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Lunaspis.offsetY = 1.05F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraParioscorpio ee = (EntityPrehistoricFloraParioscorpio) entitylivingbaseIn;

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraParioscorpio entity = (EntityPrehistoricFloraParioscorpio) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-47.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -47.5 + (((tickAnim - 10) / 5) * (30-(-47.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 15) / 5) * (30-(30)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 30 + (((tickAnim - 20) / 5) * (0-(30)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 32.5 + (((tickAnim - 10) / 4) * (-30-(32.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = -30 + (((tickAnim - 14) / 1) * (32.5-(-30)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 15) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 20) / 5) * (0-(32.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (47.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 47.5 + (((tickAnim - 10) / 5) * (-30-(47.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 15) / 5) * (-30-(-30)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 20) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -32.5 + (((tickAnim - 10) / 4) * (30-(-32.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 30 + (((tickAnim - 14) / 1) * (-32.5-(30)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -32.5 + (((tickAnim - 15) / 5) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -32.5 + (((tickAnim - 20) / 5) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
}
