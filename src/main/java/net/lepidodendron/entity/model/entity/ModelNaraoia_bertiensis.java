package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraNaraoia_bertiensis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelNaraoia_bertiensis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer n_bertiensis;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;

    public ModelNaraoia_bertiensis() {
        this.textureWidth = 30;
        this.textureHeight = 25;

        this.n_bertiensis = new AdvancedModelRenderer(this);
        this.n_bertiensis.setRotationPoint(0.0F, 24.0F, 0.45F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.15F, -0.25F);
        this.n_bertiensis.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 6, -3.0F, -1.0F, -2.75F, 6, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 14, -0.5F, -1.0F, -5.65F, 1, 1, 1, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 13, -2.0F, -1.0F, -4.75F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 0, -0.5F, -1.5F, -3.9F, 1, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 20, -1.0F, -0.5F, -3.75F, 2, 1, 2, 0.051F, false));
        this.head.cubeList.add(new ModelBox(head, 3, 3, -2.0F, -0.5F, -1.9F, 4, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -0.85F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -3.1416F, 0.0F, 3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 16, -2.5F, -3.0F, -1.0F, 5, 1, 1, -0.049F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 2.0F, -5.65F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 10, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.9974F, 2.0F, -2.8022F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.2321F, 2.0F, -4.65F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.1781F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.9974F, 2.0F, -2.8022F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.2321F, 2.0F, -4.65F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.1781F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 2.0F, -5.65F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 10, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(1.0F, 0.5F, -2.75F);
        this.head.addChild(anntennae1);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, 9, 0, 0.0F, -0.25F, -3.5F, 3, 0, 4, 0.0F, true));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-1.0F, 0.5F, -2.75F);
        this.head.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 9, 0, -3.0F, -0.25F, -3.5F, 3, 0, 4, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.6913F, 0.4881F, -1.0F);
        this.head.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.0094F, -0.0426F, 0.2184F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 0, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.6913F, 0.4881F, -1.0F);
        this.head.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.0094F, 0.0426F, -0.2184F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 2, 2, -2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 2, -1.0F, -0.5F, 3.0F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, 2.0F, 2.75F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -3.1416F, 0.0F, 3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, -6.0F, -3.0F, 0.0F, 6, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 20, -3.5F, -3.0F, -3.0F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.0F, 2.0F, 2.75F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -3.1416F, -1.0472F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, 0.0F, -3.0F, 0.0F, 2, 1, 3, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 2.0F, 4.4821F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, -0.6109F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 7, 0.0F, -3.0F, 0.0F, 2, 1, 2, -0.0025F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, 2.0F, 2.75F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.1416F, 1.0472F, 3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, -2.0F, -3.0F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 2.0F, 4.4821F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.1416F, 0.6109F, 3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 7, -2.0F, -3.0F, 0.0F, 2, 1, 2, -0.0025F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0F, -0.15F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.1416F, 0.0F, 3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 5, -2.5F, -3.0F, -1.0F, 5, 1, 1, -0.05F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.0F, -0.6F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -3.1416F, 0.0F, 3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 8, -0.5F, -3.5F, -4.5F, 1, 1, 4, -0.001F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.4413F, 0.4881F, 1.0F);
        this.body.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.0285F, -0.1278F, 0.22F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.4413F, 0.4881F, 1.0F);
        this.body.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.0285F, 0.1278F, -0.22F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0587F, 0.4881F, 3.0F);
        this.body.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0479F, -0.2129F, 0.2233F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0587F, 0.4881F, 3.0F);
        this.body.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0479F, 0.2129F, -0.2233F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.n_bertiensis.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.n_bertiensis.offsetY = -2.0F;
        this.n_bertiensis.offsetX = -1.338F;
        this.n_bertiensis.rotateAngleY = (float)Math.toRadians(200);
        this.n_bertiensis.rotateAngleX = (float)Math.toRadians(8);
        this.n_bertiensis.rotateAngleZ = (float)Math.toRadians(-8);
        this.n_bertiensis.scaleChildren = true;
        float scaler = 1.63F;
        this.n_bertiensis.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.n_bertiensis.render(f);
        //Reset rotations, positions and sizing:
        this.n_bertiensis.setScale(1.0F, 1.0F, 1.0F);
        this.n_bertiensis.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.n_bertiensis.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.n_bertiensis.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraNaraoia_bertiensis) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

           }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}