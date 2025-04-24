package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelDunyu extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelDunyu() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.9F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -1.0F, -12.25F, 3, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.8679F, -1.0F, -5.1006F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0036F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 23, -2.175F, 0.0F, -1.025F, 3, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.8679F, -1.0F, -5.1006F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 23, -0.825F, 0.0F, -1.025F, 3, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(5.46F, -1.0F, -6.5606F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.6232F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, 0.0494F, 0.0F, -0.0003F, 4, 1, 2, 0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.46F, -1.0F, -6.5606F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.6232F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -4.0494F, 0.0F, -0.0003F, 4, 1, 2, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(5.1063F, -1.0F, -9.6746F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.3526F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 14, 0.165F, 0.0F, 0.3238F, 3, 1, 4, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.1063F, -1.0F, -9.6746F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.3526F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 14, -3.165F, 0.0F, 0.3238F, 3, 1, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -1.0F, -12.25F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.781F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 0, -4.0F, 0.0F, 0.0F, 4, 1, 5, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 0, -4.0F, 0.0F, 0.0F, 4, 1, 5, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, -1.0F, -12.25F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.781F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 0, 0.0F, 0.0F, 0.0F, 4, 1, 5, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -2.439F, -8.6805F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1242F, -0.0414F, 0.3203F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 20, 0.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 25, 0.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -2.439F, -8.6805F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1242F, 0.0414F, -0.3203F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 25, -1.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 20, -2.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.5F, -8.25F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2793F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, -1.5F, 0.4F, -4.0F, 3, 1, 6, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -1.0F, -6.75F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 12, 7, -2.0F, -1.0F, 0.0F, 4, 2, 4, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 13, -1.5F, -1.25F, 0.0F, 3, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, 0.0F, -3.25F, 0.5F, 0, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 18, -1.0F, -1.25F, 0.0F, 2, 2, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 4, 0.0F, -3.25F, 1.5F, 0, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 22, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 9, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = 0.02F;
        this.main.offsetY = -0.24F;
        this.main.offsetZ = 0.051F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.3491F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -1.0036F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -1.6232F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 1.6232F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -1.3526F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 1.3526F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.781F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.781F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1242F, -0.0414F, 0.3203F);
        this.setRotateAngle(cube_r10, 0.1242F, 0.0414F, -0.3203F);
        this.setRotateAngle(cube_r11, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2628F, 0.0843F, 0.0226F);
        this.setRotateAngle(tail3, 0.088F, -0.1304F, -0.0115F);
        this.setRotateAngle(tail4, 0.0859F, -0.1964F, -0.0129F);
        this.setRotateAngle(tail5, 0.132F, 0.1298F, 0.0172F);
        this.main.offsetY = -0.03F;
        this.main.offsetZ = 0.01F;
        this.main.offsetX = 0.01F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, 0.0F, -1.0036F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -1.6232F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 1.6232F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -1.3526F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 1.3526F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.781F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.781F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1242F, -0.0414F, 0.3203F);
        this.setRotateAngle(cube_r10, 0.1242F, 0.0414F, -0.3203F);
        this.setRotateAngle(cube_r11, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2628F, 0.0843F, 0.0226F);
        this.setRotateAngle(tail3, 0.088F, -0.1304F, -0.0115F);
        this.setRotateAngle(tail4, 0.0859F, -0.1964F, -0.0129F);
        this.setRotateAngle(tail5, 0.132F, 0.1298F, 0.0172F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 0;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.4F;
        float taildegree = 0.3F;

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
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
