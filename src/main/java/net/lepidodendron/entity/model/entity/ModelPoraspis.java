package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPoraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;

    public ModelPoraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 19, -1.0F, -5.4F, -1.9F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 20, -1.5F, -5.1F, -10.25F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 5, -1.99F, -5.4F, -4.9F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, -1.5F, -4.35F, -8.75F, 3, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, -3.35F, -7.75F, 3, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 15, -2.0F, -1.25F, -6.4F, 4, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 22, -1.0F, -1.25F, -2.4F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 0, -1.5F, -1.25F, -8.4F, 3, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -1.99F, -3.4F, -3.6F, 1, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, 0.99F, -3.4F, -3.6F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, -0.1047F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 24, -2.4F, -2.4F, -7.8F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.1047F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 23, 1.4F, -2.4F, -7.8F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 0, -2.0F, -5.75F, -8.1F, 4, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 0, 0.49F, -8.5F, -3.75F, 1, 2, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.49F, -8.5F, -3.75F, 1, 2, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 3, -0.5F, -8.5F, -3.74F, 1, 1, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -3.0F, -2.75F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 9, 6, -1.5F, -1.95F, 0.0F, 3, 4, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, 2.75F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 23, -0.51F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 27, -0.5F, -1.5F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.0F, 2.75F);
        this.body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 1, -0.5F, -5.25F, 0.0F, 1, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 31, -0.49F, -4.75F, 1.5F, 1, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 15, 20, -1.0F, -1.94F, 0.0F, 2, 4, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, -2.25F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 28, -0.5F, -2.5F, 1.75F, 1, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 17, -0.51F, -3.0F, 3.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -2.25F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 29, -0.49F, -3.75F, 4.5F, 1, 1, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 30, -0.5F, -4.25F, 3.25F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, -1.0F, -1.45F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.0F, -5.25F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 28, -0.51F, -4.25F, 6.0F, 1, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 28, -0.5F, -3.75F, 4.5F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.0F, -5.25F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 26, -0.5F, -3.0F, 6.0F, 1, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 10, -0.49F, -2.5F, 7.5F, 1, 1, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 12, -0.5F, -0.95F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.0F, -8.25F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 29, -0.51F, -5.0F, 8.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.0F, -8.25F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 29, -0.49F, -1.75F, 9.5F, 1, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -2.0F, 0.0F, 0, 4, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.3F);
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
        this.head.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4, this.tail};

        float speed = 0.4F;
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
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(head, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 0.95F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
