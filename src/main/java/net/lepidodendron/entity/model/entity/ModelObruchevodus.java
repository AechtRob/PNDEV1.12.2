package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelObruchevodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelObruchevodus() {
        this.textureWidth = 36;
        this.textureHeight = 28;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-1.55F, 20.6F, -4.4F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.05F, -1.425F, -0.6F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.05F, -1.5F, 1.4F, 3, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 17, 0.0F, -1.0F, -0.25F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 13, 0.0F, -1.75F, -0.25F, 1, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 3, 20, 0.0F, -1.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 2.15F, -1.425F, -0.6F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 3, 20, 2.1F, -1.75F, -1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 19, 2.1F, -1.0F, -1.0F, 1, 1, 1, 0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 16, 17, 2.1F, -1.0F, -0.25F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 12, 13, 2.1F, -1.75F, -0.25F, 1, 1, 1, 0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.05F, 2.725F, 3.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 5, -2.0F, -2.0F, -1.0F, 3, 2, 3, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.05F, 3.05F, 0.15F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 17, -2.0F, -2.0F, -1.0F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.05F, 0.4F, -0.625F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 23, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.05F, -1.4F, 0.125F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6807F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 18, -2.0F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.05F, 0.1F, -1.725F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6807F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 14, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.05F, 1.15F, -2.35F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.05F, 1.9F, 0.15F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -2.0F, -4.0F, -1.0F, 3, 4, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.45F, -2.25F, 1.6F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, 2.0F, -1.0F, -1.0F, 0, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.05F, -0.75F, 3.35F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 19, -2.0F, -1.0F, -1.0F, 3, 1, 3, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(0.05F, 1.825F, 0.4F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, 1.0472F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 0, 0.0F, 0.0F, -2.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.05F, 1.825F, 0.4F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, -1.0472F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 0, 0.0F, 0.0F, -2.0F, 0, 3, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(1.55F, 0.575F, 5.4F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 6, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.45F, 0.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 12, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.5F, 1.25F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 9, 1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 0, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.0F, 2.0F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.829F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.829F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.525F, 0.5F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 0, 0.0F, -1.0F, -1.0F, 1, 1, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 1.85F, 2.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 19, 1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.025F, 0.5F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 23, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(2.05F, 1.4F, -0.25F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.325F, -1.25F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 0, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 10, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 0.0F, 1.6F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.body.offsetZ = -0.25F;
        this.body.offsetY = -0.22F;
        this.body.offsetX = -0.03F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.body.offsetZ = -0.0F;
        this.body.offsetY = -0.0F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.5F;
        this.body.offsetX = -0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(-68);
        this.body.rotateAngleX = (float)Math.toRadians(15);
        this.body.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 4.5F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, -0.2F, -3.6F, 0.0F);
        this.setRotateAngle(body2, 0.5F, -0.9F, -0.2F);
        this.setRotateAngle(body3, 0.0F, -1.0F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
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
        //this.body.offsetY = 0.8F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};

        float speed = 0.485F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
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
            speed = 0.185F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3.25, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinleft, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(pelvicfinleft, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(pelvicfinright, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 1F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
