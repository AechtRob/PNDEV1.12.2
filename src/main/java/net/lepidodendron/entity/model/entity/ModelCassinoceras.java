package net.lepidodendron.entity.model.entity;


import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCassinoceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended tentaclebase2;
    private final AdvancedModelRendererExtended tentacle6;
    private final AdvancedModelRendererExtended outertentacle6;
    private final AdvancedModelRendererExtended tentacle7;
    private final AdvancedModelRendererExtended outertentacle7;
    private final AdvancedModelRendererExtended tentacle8;
    private final AdvancedModelRendererExtended outertentacle8;
    private final AdvancedModelRendererExtended tentacle9;
    private final AdvancedModelRendererExtended outertentacle9;
    private final AdvancedModelRendererExtended tentacle10;
    private final AdvancedModelRendererExtended outertentacle10;
    private final AdvancedModelRendererExtended tentaclebase3;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended outertentacle2;
    private final AdvancedModelRendererExtended tentacle3;
    private final AdvancedModelRendererExtended outertentacle3;
    private final AdvancedModelRendererExtended tentacle4;
    private final AdvancedModelRendererExtended outertentacle4;
    private final AdvancedModelRendererExtended tentacle5;
    private final AdvancedModelRendererExtended outertentacle5;
    private final AdvancedModelRendererExtended tentacle11;
    private final AdvancedModelRendererExtended outertentacle11;

    public ModelCassinoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.0F, 13.601F, 7.3753F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 2.6391F, 2.7135F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 32, -1.5F, -1.8892F, 3.1557F, 3, 2, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 36, -1.5F, -1.8892F, -0.0943F, 3, 2, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.1896F, 6.242F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6283F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.799F, -0.1597F, 2, 1, 1, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 9, -1.0F, -0.799F, 0.0903F, 2, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -5.2233F, -7.9247F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 46, -1.0F, 4.7029F, 13.5315F, 2, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 8, -1.5F, 2.9529F, 9.6315F, 3, 4, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 31, -2.0F, 0.9529F, 5.9315F, 4, 8, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, -2.5F, -0.0471F, -0.0685F, 5, 10, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 4.1524F, -1.1496F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -1.0F, -2.0026F, -12.0008F, 2, 2, 4, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 8, -2.5F, -2.0026F, -8.0008F, 5, 2, 8, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 31, -2.0F, -1.0026F, -0.0008F, 4, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -3.2343F, 6.5819F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7941F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 31, -1.0F, 0.0122F, -0.0071F, 2, 2, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -5.0858F, 1.9473F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3883F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 32, -1.5F, -0.0291F, -0.0166F, 3, 2, 5, -0.001F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -5.7383F, -1.984F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1658F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 18, -2.0F, -0.0267F, -0.0316F, 4, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -2.7021F, -13.5659F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5367F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 0, -2.5F, 0.127F, -5.8904F, 5, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 4.399F, -7.3753F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -3.0F, -9.0F, -2.5F, 6, 10, 6, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -2.7021F, -13.5659F);
        this.shell.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 39, -2.6F, 2.625F, -2.925F, 1, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 39, 1.6F, 2.625F, -2.925F, 1, 3, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 18, -2.0F, 2.0F, -5.6F, 4, 7, 6, 0.0F, false));

        this.tentaclebase2 = new AdvancedModelRendererExtended(this);
        this.tentaclebase2.setRotationPoint(1.625F, 8.1977F, -1.7806F);
        this.head.addChild(tentaclebase2);


        this.tentacle6 = new AdvancedModelRendererExtended(this);
        this.tentacle6.setRotationPoint(-0.15F, 0.675F, -0.05F);
        this.tentaclebase2.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.4363F, 0.0F, 0.0F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 31, 46, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle6 = new AdvancedModelRendererExtended(this);
        this.outertentacle6.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle6.addChild(outertentacle6);
        this.setRotateAngle(outertentacle6, 0.0F, 0.2182F, 0.0F);
        this.outertentacle6.cubeList.add(new ModelBox(outertentacle6, 45, 13, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle7 = new AdvancedModelRendererExtended(this);
        this.tentacle7.setRotationPoint(-0.475F, 1.8F, 0.325F);
        this.tentaclebase2.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.3999F, -0.1796F, 0.3999F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 45, 1, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle7 = new AdvancedModelRendererExtended(this);
        this.outertentacle7.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle7.addChild(outertentacle7);
        this.setRotateAngle(outertentacle7, 0.0F, 0.2182F, 0.0F);
        this.outertentacle7.cubeList.add(new ModelBox(outertentacle7, 0, 45, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle8 = new AdvancedModelRendererExtended(this);
        this.tentacle8.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.tentaclebase2.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.4363F, 0.0F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 44, 43, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle8 = new AdvancedModelRendererExtended(this);
        this.outertentacle8.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle8.addChild(outertentacle8);
        this.setRotateAngle(outertentacle8, 0.0F, 0.2618F, 0.0F);
        this.outertentacle8.cubeList.add(new ModelBox(outertentacle8, 44, 36, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle9 = new AdvancedModelRendererExtended(this);
        this.tentacle9.setRotationPoint(-0.15F, -1.625F, -1.075F);
        this.tentaclebase2.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.4363F, 0.0F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 10, 44, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle9 = new AdvancedModelRendererExtended(this);
        this.outertentacle9.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle9.addChild(outertentacle9);
        this.setRotateAngle(outertentacle9, 0.0F, 0.0873F, 0.0F);
        this.outertentacle9.cubeList.add(new ModelBox(outertentacle9, 44, 5, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle10 = new AdvancedModelRendererExtended(this);
        this.tentacle10.setRotationPoint(-0.8F, -2.95F, -2.125F);
        this.tentaclebase2.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.3747F, 0.2291F, -0.5236F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 26, 43, -0.5F, 0.1339F, -2.8595F, 1, 1, 3, 0.0F, false));

        this.outertentacle10 = new AdvancedModelRendererExtended(this);
        this.outertentacle10.setRotationPoint(0.0F, 0.6518F, -2.8284F);
        this.tentacle10.addChild(outertentacle10);
        this.setRotateAngle(outertentacle10, 0.0F, 0.2182F, 0.0F);
        this.outertentacle10.cubeList.add(new ModelBox(outertentacle10, 18, 43, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentaclebase3 = new AdvancedModelRendererExtended(this);
        this.tentaclebase3.setRotationPoint(-1.625F, 8.1977F, -1.7806F);
        this.head.addChild(tentaclebase3);


        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(0.15F, 0.675F, -0.05F);
        this.tentaclebase3.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.4363F, 0.0F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 5, 43, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle2 = new AdvancedModelRendererExtended(this);
        this.outertentacle2.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle2.addChild(outertentacle2);
        this.setRotateAngle(outertentacle2, 0.0F, -0.2182F, 0.0F);
        this.outertentacle2.cubeList.add(new ModelBox(outertentacle2, 39, 42, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle3 = new AdvancedModelRendererExtended(this);
        this.tentacle3.setRotationPoint(0.475F, 1.8F, 0.325F);
        this.tentaclebase3.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.3999F, 0.1796F, -0.3999F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 31, 42, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle3 = new AdvancedModelRendererExtended(this);
        this.outertentacle3.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle3.addChild(outertentacle3);
        this.setRotateAngle(outertentacle3, 0.0F, -0.2182F, 0.0F);
        this.outertentacle3.cubeList.add(new ModelBox(outertentacle3, 42, 27, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle4 = new AdvancedModelRendererExtended(this);
        this.tentacle4.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.tentaclebase3.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.4363F, 0.0F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 42, 23, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle4 = new AdvancedModelRendererExtended(this);
        this.outertentacle4.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle4.addChild(outertentacle4);
        this.setRotateAngle(outertentacle4, 0.0F, -0.2618F, 0.0F);
        this.outertentacle4.cubeList.add(new ModelBox(outertentacle4, 13, 40, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle5 = new AdvancedModelRendererExtended(this);
        this.tentacle5.setRotationPoint(0.15F, -1.625F, -1.075F);
        this.tentaclebase3.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.4363F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 40, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.outertentacle5 = new AdvancedModelRendererExtended(this);
        this.outertentacle5.setRotationPoint(0.0F, 0.0179F, -2.9689F);
        this.tentacle5.addChild(outertentacle5);
        this.setRotateAngle(outertentacle5, 0.0F, -0.0873F, 0.0F);
        this.outertentacle5.cubeList.add(new ModelBox(outertentacle5, 8, 39, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle11 = new AdvancedModelRendererExtended(this);
        this.tentacle11.setRotationPoint(0.8F, -2.95F, -2.125F);
        this.tentaclebase3.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.3747F, -0.2291F, 0.5236F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 30, 31, -0.5F, 0.1339F, -2.8595F, 1, 1, 3, 0.0F, false));

        this.outertentacle11 = new AdvancedModelRendererExtended(this);
        this.outertentacle11.setRotationPoint(0.0F, 0.6518F, -2.8284F);
        this.tentacle11.addChild(outertentacle11);
        this.setRotateAngle(outertentacle11, 0.0F, -0.2182F, 0.0F);
        this.outertentacle11.cubeList.add(new ModelBox(outertentacle11, 16, 18, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shell.render(f5 * 0.17F);
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
        this.shell.offsetY = 4F;
        float offsetZ = -0.19F;

        AdvancedModelRendererExtended[] tentacle2 = {this.tentacle2, this.outertentacle2};
        AdvancedModelRendererExtended[] tentacle3 = {this.tentacle3, this.outertentacle3};
        AdvancedModelRendererExtended[] tentacle4 = {this.tentacle4, this.outertentacle4};
        AdvancedModelRendererExtended[] tentacle5 = {this.tentacle5, this.outertentacle5};
        AdvancedModelRendererExtended[] tentacle6 = {this.tentacle6, this.outertentacle6};
        AdvancedModelRendererExtended[] tentacle7 = {this.tentacle7, this.outertentacle7};
        AdvancedModelRendererExtended[] tentacle8 = {this.tentacle8, this.outertentacle8};
        AdvancedModelRendererExtended[] tentacle9 = {this.tentacle9, this.outertentacle9};
        AdvancedModelRendererExtended[] tentacle10 = {this.tentacle10, this.outertentacle10};
        AdvancedModelRendererExtended[] tentacle11 = {this.tentacle11, this.outertentacle11};

        float speed = 0.15F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainSwing(tentacle8, speed, -0.3F, -2.5F, f2, 0.5F);
        //Left lower middle:
        this.chainSwing(tentacle6, speed, -0.3F, -2F, f2, 0.5F);
        //Left lower bottom:
        this.chainSwing(tentacle7, speed, -0.3F, -2.5F, f2, 0.5F);
        //Left upper middle:
        this.chainSwing(tentacle9, speed, -0.3F, -2.5F, f2, 0.5F);
        //Left upper top:
        this.chainSwing(tentacle10, speed, -0.3F, -2, f2, 0.5F);

        //Right:
        this.chainSwing(tentacle4, speed, 0.3F, -2.5F, f2, 0.5F);
        //Right lower middle:
        this.chainSwing(tentacle2, speed, 0.3F, -2F, f2, 0.5F);
        //Right lower bottom:
        this.chainSwing(tentacle3, speed, 0.3F, -2.5F, f2, 0.5F);
        //Right upper middle:
        this.chainSwing(tentacle5, speed, 0.3F, -2.5F, f2, 0.5F);
        //Right upper top:
        this.chainSwing(tentacle11, speed, 0.3F, -2, f2, 0.5F);

        if (e.isInWater()) {
            this.bob(shell, speed, 3.0F, false, f2, 2);
            this.flap(shell, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.walk(shell, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.shell.offsetY = this.moveBoxExtended(speed, 0.05F, false, 0, f2, 0.5F) + 1.3F;
            this.shell.rotateAngleY = (float) Math.toRadians(180);
            this.shell.offsetZ = offsetZ;
        }
        else {
            this.shell.rotateAngleZ = (float) Math.toRadians(90);
            this.shell.offsetY = 1.32F;
            this.shell.offsetZ = offsetZ;
        }

    }

}
