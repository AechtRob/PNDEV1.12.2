package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelWillwerathia extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legs;
    private final AdvancedModelRenderer legs6;
    private final AdvancedModelRenderer legs2;
    private final AdvancedModelRenderer legs7;
    private final AdvancedModelRenderer legs3;
    private final AdvancedModelRenderer legs8;
    private final AdvancedModelRenderer legs4;
    private final AdvancedModelRenderer legs9;
    private final AdvancedModelRenderer legs5;
    private final AdvancedModelRenderer legs10;
    private final AdvancedModelRenderer segment;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer segment6;

    public ModelWillwerathia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.9238F, -6.0798F);
        this.head.cubeList.add(new ModelBox(head, 10, 6, -2.5F, -0.1738F, -1.9202F, 5, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 11, -1.0F, -0.1738F, 0.0798F, 2, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -0.1738F, -1.9202F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1009F, -0.3013F, -0.0455F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 0, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, -0.1738F, -1.9202F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1009F, 0.3013F, 0.0455F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 0, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0762F, -0.4202F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 15, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.3116F, 0.0193F, 0.9467F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0938F, -0.4793F, -0.0171F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.0881F, -0.4519F, -0.4501F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.3116F, 0.0193F, 0.9467F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0938F, 0.4793F, 0.0171F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0881F, -0.4519F, -0.4501F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -0.1738F, -1.9202F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -0.1738F, -1.9202F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 12, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.4238F, 1.0798F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 14, -1.5F, -0.0124F, -0.0104F, 3, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1738F, -1.9202F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -2.5F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.legs = new AdvancedModelRenderer(this);
        this.legs.setRotationPoint(0.9782F, 0.3262F, -0.8202F);
        this.head.addChild(legs);
        this.setRotateAngle(legs, 0.0F, 1.1781F, 0.0F);
        this.legs.cubeList.add(new ModelBox(legs, 0, 6, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legs6 = new AdvancedModelRenderer(this);
        this.legs6.setRotationPoint(-0.9782F, 0.3262F, -0.8202F);
        this.head.addChild(legs6);
        this.setRotateAngle(legs6, 0.0F, -1.1781F, 0.0F);
        this.legs6.cubeList.add(new ModelBox(legs6, 0, 6, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legs2 = new AdvancedModelRenderer(this);
        this.legs2.setRotationPoint(0.9782F, 0.3262F, -0.4202F);
        this.head.addChild(legs2);
        this.setRotateAngle(legs2, 0.0F, 0.8727F, 0.0F);
        this.legs2.cubeList.add(new ModelBox(legs2, 0, 5, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legs7 = new AdvancedModelRenderer(this);
        this.legs7.setRotationPoint(-0.9782F, 0.3262F, -0.4202F);
        this.head.addChild(legs7);
        this.setRotateAngle(legs7, 0.0F, -0.8727F, 0.0F);
        this.legs7.cubeList.add(new ModelBox(legs7, 0, 5, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legs3 = new AdvancedModelRenderer(this);
        this.legs3.setRotationPoint(0.9782F, 0.3262F, -0.0702F);
        this.head.addChild(legs3);
        this.setRotateAngle(legs3, 0.0F, 0.48F, 0.0F);
        this.legs3.cubeList.add(new ModelBox(legs3, 0, 4, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legs8 = new AdvancedModelRenderer(this);
        this.legs8.setRotationPoint(-0.9782F, 0.3262F, -0.0702F);
        this.head.addChild(legs8);
        this.setRotateAngle(legs8, 0.0F, -0.48F, 0.0F);
        this.legs8.cubeList.add(new ModelBox(legs8, 0, 4, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legs4 = new AdvancedModelRenderer(this);
        this.legs4.setRotationPoint(0.9782F, 0.3262F, 0.1798F);
        this.head.addChild(legs4);
        this.setRotateAngle(legs4, 0.0F, -0.0873F, 0.0F);
        this.legs4.cubeList.add(new ModelBox(legs4, 0, 3, 0.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legs9 = new AdvancedModelRenderer(this);
        this.legs9.setRotationPoint(-0.9782F, 0.3262F, 0.1798F);
        this.head.addChild(legs9);
        this.setRotateAngle(legs9, 0.0F, 0.0873F, 0.0F);
        this.legs9.cubeList.add(new ModelBox(legs9, 0, 3, -1.0F, -0.25F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legs5 = new AdvancedModelRenderer(this);
        this.legs5.setRotationPoint(0.9782F, 0.0762F, 0.5798F);
        this.head.addChild(legs5);
        this.setRotateAngle(legs5, 0.0F, -0.5672F, 0.0F);
        this.legs5.cubeList.add(new ModelBox(legs5, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legs10 = new AdvancedModelRenderer(this);
        this.legs10.setRotationPoint(-0.9782F, 0.0762F, 0.5798F);
        this.head.addChild(legs10);
        this.setRotateAngle(legs10, 0.0F, 0.5672F, 0.0F);
        this.legs10.cubeList.add(new ModelBox(legs10, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.segment = new AdvancedModelRenderer(this);
        this.segment.setRotationPoint(0.0395F, -0.1445F, 1.0798F);
        this.head.addChild(segment);
        this.segment.cubeList.add(new ModelBox(segment, 0, 7, -2.0395F, -0.0293F, 0.0F, 4, 0, 2, 0.0F, false));
        this.segment.cubeList.add(new ModelBox(segment, 18, 0, -0.5395F, -0.0393F, 0.0F, 1, 0, 2, 0.0F, false));
        this.segment.cubeList.add(new ModelBox(segment, 10, 3, -1.5395F, -0.0293F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0395F, -0.0293F, 1.0F);
        this.segment.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.7418F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 0, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.9605F, -0.0293F, 1.0F);
        this.segment.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.7418F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 0, 5, -2.0395F, -0.0293F, 0.0F, 4, 0, 2, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 18, 0, -0.5395F, -0.0393F, 0.0F, 1, 0, 2, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 0, 9, -1.5395F, -0.0293F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0395F, -0.0293F, -1.0F);
        this.segment2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.7418F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 7, -1.0F, 0.0F, 1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.9605F, -0.0293F, -1.0F);
        this.segment2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.7418F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 7, 0.0F, 0.0F, 1.0F, 1, 0, 2, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 0, 3, -2.0395F, -0.0293F, 0.0F, 4, 0, 2, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 18, 0, -0.5395F, -0.0393F, 0.0F, 1, 0, 2, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 8, 7, -1.5395F, -0.0293F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0395F, -0.0293F, -3.0F);
        this.segment3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.7418F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 12, -1.0F, 0.0F, 3.0F, 1, 0, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.9605F, -0.0293F, -3.0F);
        this.segment3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.7418F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 12, 0.0F, 0.0F, 3.0F, 1, 0, 2, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(-0.1667F, 0.0F, 2.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 8, 10, -1.3729F, -0.0293F, 0.0F, 3, 0, 2, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 5, 12, -0.8729F, -0.0293F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.3729F, -0.0293F, 1.0F);
        this.segment4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.7418F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 3, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.6271F, -0.0293F, 1.0F);
        this.segment4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 3, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0594F, -0.0051F, 2.0351F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 18, 0, -0.4323F, -0.0342F, -0.0351F, 1, 0, 2, 0.0F, false));
        this.segment5.cubeList.add(new ModelBox(segment5, 9, 12, -0.9323F, -0.0242F, -0.0351F, 2, 0, 2, 0.0F, false));
        this.segment5.cubeList.add(new ModelBox(segment5, 4, 15, -0.4323F, -0.0242F, -0.0351F, 1, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4323F, -0.0242F, 1.9649F);
        this.segment5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0939F, -0.3367F, 0.2778F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 1, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5677F, -0.0242F, 1.9649F);
        this.segment5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0939F, 0.3367F, -0.2778F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 1, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.9323F, -0.0242F, 0.9649F);
        this.segment5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.7418F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 15, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0677F, -0.0242F, 0.9649F);
        this.segment5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.7418F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 15, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0677F, 0.0258F, 1.9649F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 0, 12, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.45F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.render(0.023F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.head.offsetY = 0.82F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] Tail = {this.segment, this.segment2, this.segment3, this.segment4, this.segment5, this.segment6};

        if (f3 != 0) {
            //Left
            this.swing(legs, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legs2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legs3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legs4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legs5, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(legs6, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(legs7, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legs8, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legs9, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legs10, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
        }

        if (isAtBottom) {
            this.chainSwing(Tail, 0.1F, 0.1F, -2, f2, 1.0F);
            this.bob(head, 0.0F, 0.0F, false, f2, 1);
        } else {
            this.chainSwing(Tail, 0.2F, 0.08F, -2, f2, 0.5F);
            this.bob(head, 0.2F, 0.1F, false, f2, 0.5F);
        }

    }
}
