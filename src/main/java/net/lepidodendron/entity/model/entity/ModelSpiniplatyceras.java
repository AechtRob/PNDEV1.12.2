package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraNipponomaria;
import net.lepidodendron.entity.EntityPrehistoricFloraSpiniplatyceras;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSpiniplatyceras extends AdvancedModelBase {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer copyspikes_r1;
    private final AdvancedModelRenderer copyspikes_r2;
    private final AdvancedModelRenderer copyspikes_r3;
    private final AdvancedModelRenderer copyspikes_r4;
    private final AdvancedModelRenderer copyspikes_r5;
    private final AdvancedModelRenderer copyspikes_r6;
    private final AdvancedModelRenderer copyspikes_r7;
    private final AdvancedModelRenderer copyspikes_r8;
    private final AdvancedModelRenderer copyspikes_r9;
    private final AdvancedModelRenderer copyspikes_r10;
    private final AdvancedModelRenderer copyspikes_r11;
    private final AdvancedModelRenderer copyspikes_r12;
    private final AdvancedModelRenderer copyspikes_r13;
    private final AdvancedModelRenderer copyspikes_r14;
    private final AdvancedModelRenderer copyspikes_r15;
    private final AdvancedModelRenderer copyspikes_r16;
    private final AdvancedModelRenderer copyspikes_r17;
    private final AdvancedModelRenderer copyspikes_r18;
    private final AdvancedModelRenderer d_r1;
    private final AdvancedModelRenderer copyspikes_r19;
    private final AdvancedModelRenderer copyspikes_r20;
    private final AdvancedModelRenderer copyspikes_r21;
    private final AdvancedModelRenderer copyspikes_r22;
    private final AdvancedModelRenderer copyspikes_r23;
    private final AdvancedModelRenderer copyspikes_r24;
    private final AdvancedModelRenderer copyspikes_r25;
    private final AdvancedModelRenderer copyspikes_r26;
    private final AdvancedModelRenderer copyspikes_r27;
    private final AdvancedModelRenderer copyspikes_r28;
    private final AdvancedModelRenderer copyspikes_r29;
    private final AdvancedModelRenderer copyspikes_r30;
    private final AdvancedModelRenderer copyspikes_r31;
    private final AdvancedModelRenderer copyspikes_r32;
    private final AdvancedModelRenderer copyspikes_r33;
    private final AdvancedModelRenderer copyspikes_r34;
    private final AdvancedModelRenderer copyspikes_r35;
    private final AdvancedModelRenderer copyspikes_r36;
    private final AdvancedModelRenderer copyspikes_r37;
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

    public ModelSpiniplatyceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 16, 0, -1.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -1.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 25, -2.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 25, 5, -0.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 23, 23, 3.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(1.0F, -2.5F, -2.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 28, 0, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 16, 12, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(1.5F, -1.5F, -4.5F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 0, 0, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(0.5F, -1.5F, -4.5F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 0, 2, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -4.0F, -0.5F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, 0.1745F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -2.5F, -1.7F, -2.9F, 5, 4, 6, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 15, 12, -1.5F, -2.7F, -3.9F, 3, 4, 7, 0.0F, false));

        this.copyspikes_r1 = new AdvancedModelRenderer(this);
        this.copyspikes_r1.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r1);
        this.setRotateAngle(copyspikes_r1, -0.9205F, -1.3407F, 0.906F);
        this.copyspikes_r1.cubeList.add(new ModelBox(copyspikes_r1, 22, 26, 1.9199F, -0.2155F, -2.3532F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r2 = new AdvancedModelRenderer(this);
        this.copyspikes_r2.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r2);
        this.setRotateAngle(copyspikes_r2, -1.6623F, -1.3407F, 0.906F);
        this.copyspikes_r2.cubeList.add(new ModelBox(copyspikes_r2, 0, 3, 1.9199F, -4.2155F, -2.8532F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r3 = new AdvancedModelRenderer(this);
        this.copyspikes_r3.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r3);
        this.setRotateAngle(copyspikes_r3, -1.3568F, -1.3407F, 0.906F);
        this.copyspikes_r3.cubeList.add(new ModelBox(copyspikes_r3, 20, 23, 1.9199F, -1.7155F, -2.3532F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r4 = new AdvancedModelRenderer(this);
        this.copyspikes_r4.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r4);
        this.setRotateAngle(copyspikes_r4, -1.4877F, -1.3407F, 0.906F);
        this.copyspikes_r4.cubeList.add(new ModelBox(copyspikes_r4, 17, 21, 1.9199F, -2.9655F, -2.6032F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r5 = new AdvancedModelRenderer(this);
        this.copyspikes_r5.setRotationPoint(1.9475F, -1.8261F, 2.6813F);
        this.shell.addChild(copyspikes_r5);
        this.setRotateAngle(copyspikes_r5, 2.5866F, -0.9828F, 3.0456F);
        this.copyspikes_r5.cubeList.add(new ModelBox(copyspikes_r5, 16, 1, 0.5955F, -1.1462F, -4.608F, 0, 1, 5, 0.0F, true));

        this.copyspikes_r6 = new AdvancedModelRenderer(this);
        this.copyspikes_r6.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r6);
        this.setRotateAngle(copyspikes_r6, -2.8721F, -0.8207F, 2.9406F);
        this.copyspikes_r6.cubeList.add(new ModelBox(copyspikes_r6, 22, 25, 2.9199F, -0.2155F, -4.3532F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r7 = new AdvancedModelRenderer(this);
        this.copyspikes_r7.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r7);
        this.setRotateAngle(copyspikes_r7, 2.8875F, -0.8207F, 2.9406F);
        this.copyspikes_r7.cubeList.add(new ModelBox(copyspikes_r7, 0, 8, 2.4199F, 0.0345F, -3.3532F, 0, 1, 3, 0.0F, true));

        this.copyspikes_r8 = new AdvancedModelRenderer(this);
        this.copyspikes_r8.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r8);
        this.setRotateAngle(copyspikes_r8, 2.8002F, -0.8207F, 2.9406F);
        this.copyspikes_r8.cubeList.add(new ModelBox(copyspikes_r8, 0, 9, 2.6699F, -1.9655F, -4.3532F, 0, 1, 3, 0.0F, true));

        this.copyspikes_r9 = new AdvancedModelRenderer(this);
        this.copyspikes_r9.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r9);
        this.setRotateAngle(copyspikes_r9, -0.663F, -1.1161F, 0.0413F);
        this.copyspikes_r9.cubeList.add(new ModelBox(copyspikes_r9, 0, 2, -0.0801F, -2.9655F, -3.1032F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r10 = new AdvancedModelRenderer(this);
        this.copyspikes_r10.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r10);
        this.setRotateAngle(copyspikes_r10, -0.5321F, -1.1161F, 0.0413F);
        this.copyspikes_r10.cubeList.add(new ModelBox(copyspikes_r10, 20, 22, -0.0801F, -1.7155F, -2.3532F, 0, 1, 4, 0.0F, true));

        this.copyspikes_r11 = new AdvancedModelRenderer(this);
        this.copyspikes_r11.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r11);
        this.setRotateAngle(copyspikes_r11, -0.3634F, -1.0156F, 0.267F);
        this.copyspikes_r11.cubeList.add(new ModelBox(copyspikes_r11, 7, 20, -0.3301F, -0.2155F, -4.3532F, 0, 1, 5, 0.0F, true));

        this.copyspikes_r12 = new AdvancedModelRenderer(this);
        this.copyspikes_r12.setRotationPoint(2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r12);
        this.setRotateAngle(copyspikes_r12, -0.2514F, -0.3956F, -0.0244F);
        this.copyspikes_r12.cubeList.add(new ModelBox(copyspikes_r12, 0, 15, -0.75F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.copyspikes_r13 = new AdvancedModelRenderer(this);
        this.copyspikes_r13.setRotationPoint(2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r13);
        this.setRotateAngle(copyspikes_r13, -0.4426F, -0.5221F, 0.013F);
        this.copyspikes_r13.cubeList.add(new ModelBox(copyspikes_r13, 0, 14, -0.5F, -1.75F, -6.5F, 0, 1, 7, 0.0F, true));

        this.copyspikes_r14 = new AdvancedModelRenderer(this);
        this.copyspikes_r14.setRotationPoint(2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r14);
        this.setRotateAngle(copyspikes_r14, -0.6171F, -0.5221F, 0.013F);
        this.copyspikes_r14.cubeList.add(new ModelBox(copyspikes_r14, 0, 13, -0.75F, -3.25F, -6.5F, 0, 1, 7, 0.0F, true));

        this.copyspikes_r15 = new AdvancedModelRenderer(this);
        this.copyspikes_r15.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r15);
        this.setRotateAngle(copyspikes_r15, -0.6541F, -1.0303F, -0.1675F);
        this.copyspikes_r15.cubeList.add(new ModelBox(copyspikes_r15, 16, 17, -0.8301F, -3.4655F, -6.8532F, 0, 1, 6, 0.0F, true));

        this.copyspikes_r16 = new AdvancedModelRenderer(this);
        this.copyspikes_r16.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r16);
        this.setRotateAngle(copyspikes_r16, -0.9486F, -1.2001F, 0.1054F);
        this.copyspikes_r16.cubeList.add(new ModelBox(copyspikes_r16, 16, 18, 0.1699F, -3.9655F, -6.8532F, 0, 1, 6, 0.0F, true));

        this.copyspikes_r17 = new AdvancedModelRenderer(this);
        this.copyspikes_r17.setRotationPoint(2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r17);
        this.setRotateAngle(copyspikes_r17, -1.9677F, -1.3407F, 0.906F);
        this.copyspikes_r17.cubeList.add(new ModelBox(copyspikes_r17, 0, 32, 1.9199F, -4.7155F, -6.8532F, 0, 1, 5, 0.0F, true));

        this.copyspikes_r18 = new AdvancedModelRenderer(this);
        this.copyspikes_r18.setRotationPoint(0.9336F, -1.1501F, 4.6387F);
        this.shell.addChild(copyspikes_r18);
        this.setRotateAngle(copyspikes_r18, 2.6577F, -0.4064F, 2.9287F);
        this.copyspikes_r18.cubeList.add(new ModelBox(copyspikes_r18, 0, 1, -0.75F, -1.75F, -2.5F, 0, 1, 4, 0.0F, true));

        this.d_r1 = new AdvancedModelRenderer(this);
        this.d_r1.setRotationPoint(0.9336F, -1.1501F, 4.6387F);
        this.shell.addChild(d_r1);
        this.setRotateAngle(d_r1, 2.8638F, -0.2115F, 2.8255F);
        this.d_r1.cubeList.add(new ModelBox(d_r1, 0, 7, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.copyspikes_r19 = new AdvancedModelRenderer(this);
        this.copyspikes_r19.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r19);
        this.setRotateAngle(copyspikes_r19, -0.9205F, 1.3407F, -0.906F);
        this.copyspikes_r19.cubeList.add(new ModelBox(copyspikes_r19, 22, 26, -1.9199F, -0.2155F, -2.3532F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r20 = new AdvancedModelRenderer(this);
        this.copyspikes_r20.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r20);
        this.setRotateAngle(copyspikes_r20, -1.6623F, 1.3407F, -0.906F);
        this.copyspikes_r20.cubeList.add(new ModelBox(copyspikes_r20, 0, 3, -1.9199F, -4.2155F, -2.8532F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r21 = new AdvancedModelRenderer(this);
        this.copyspikes_r21.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r21);
        this.setRotateAngle(copyspikes_r21, -1.3568F, 1.3407F, -0.906F);
        this.copyspikes_r21.cubeList.add(new ModelBox(copyspikes_r21, 20, 23, -1.9199F, -1.7155F, -2.3532F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r22 = new AdvancedModelRenderer(this);
        this.copyspikes_r22.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r22);
        this.setRotateAngle(copyspikes_r22, -1.4877F, 1.3407F, -0.906F);
        this.copyspikes_r22.cubeList.add(new ModelBox(copyspikes_r22, 17, 21, -1.9199F, -2.9655F, -2.6032F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r23 = new AdvancedModelRenderer(this);
        this.copyspikes_r23.setRotationPoint(-1.9475F, -1.8261F, 2.6813F);
        this.shell.addChild(copyspikes_r23);
        this.setRotateAngle(copyspikes_r23, 2.5866F, 0.9828F, -3.0456F);
        this.copyspikes_r23.cubeList.add(new ModelBox(copyspikes_r23, 16, 1, -0.5955F, -1.1462F, -4.608F, 0, 1, 5, 0.0F, false));

        this.copyspikes_r24 = new AdvancedModelRenderer(this);
        this.copyspikes_r24.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r24);
        this.setRotateAngle(copyspikes_r24, -2.8721F, 0.8207F, -2.9406F);
        this.copyspikes_r24.cubeList.add(new ModelBox(copyspikes_r24, 22, 25, -2.9199F, -0.2155F, -4.3532F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r25 = new AdvancedModelRenderer(this);
        this.copyspikes_r25.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r25);
        this.setRotateAngle(copyspikes_r25, 2.8875F, 0.8207F, -2.9406F);
        this.copyspikes_r25.cubeList.add(new ModelBox(copyspikes_r25, 0, 8, -2.4199F, 0.0345F, -3.3532F, 0, 1, 3, 0.0F, false));

        this.copyspikes_r26 = new AdvancedModelRenderer(this);
        this.copyspikes_r26.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r26);
        this.setRotateAngle(copyspikes_r26, 2.8002F, 0.8207F, -2.9406F);
        this.copyspikes_r26.cubeList.add(new ModelBox(copyspikes_r26, 0, 9, -2.6699F, -1.9655F, -4.3532F, 0, 1, 3, 0.0F, false));

        this.copyspikes_r27 = new AdvancedModelRenderer(this);
        this.copyspikes_r27.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r27);
        this.setRotateAngle(copyspikes_r27, -0.663F, 1.1161F, -0.0413F);
        this.copyspikes_r27.cubeList.add(new ModelBox(copyspikes_r27, 0, 2, 0.0801F, -2.9655F, -3.1032F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r28 = new AdvancedModelRenderer(this);
        this.copyspikes_r28.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r28);
        this.setRotateAngle(copyspikes_r28, -0.5321F, 1.1161F, -0.0413F);
        this.copyspikes_r28.cubeList.add(new ModelBox(copyspikes_r28, 20, 22, 0.0801F, -1.7155F, -2.3532F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r29 = new AdvancedModelRenderer(this);
        this.copyspikes_r29.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r29);
        this.setRotateAngle(copyspikes_r29, -0.3634F, 1.0156F, -0.267F);
        this.copyspikes_r29.cubeList.add(new ModelBox(copyspikes_r29, 7, 20, 0.3301F, -0.2155F, -4.3532F, 0, 1, 5, 0.0F, false));

        this.copyspikes_r30 = new AdvancedModelRenderer(this);
        this.copyspikes_r30.setRotationPoint(-2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r30);
        this.setRotateAngle(copyspikes_r30, -0.2514F, 0.3956F, 0.0244F);
        this.copyspikes_r30.cubeList.add(new ModelBox(copyspikes_r30, 0, 15, 0.75F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.copyspikes_r31 = new AdvancedModelRenderer(this);
        this.copyspikes_r31.setRotationPoint(-2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r31);
        this.setRotateAngle(copyspikes_r31, -0.4426F, 0.5221F, -0.013F);
        this.copyspikes_r31.cubeList.add(new ModelBox(copyspikes_r31, 0, 14, 0.5F, -1.75F, -6.5F, 0, 1, 7, 0.0F, false));

        this.copyspikes_r32 = new AdvancedModelRenderer(this);
        this.copyspikes_r32.setRotationPoint(-2.5F, 0.8F, -2.4F);
        this.shell.addChild(copyspikes_r32);
        this.setRotateAngle(copyspikes_r32, -0.6171F, 0.5221F, -0.013F);
        this.copyspikes_r32.cubeList.add(new ModelBox(copyspikes_r32, 0, 13, 0.75F, -3.25F, -6.5F, 0, 1, 7, 0.0F, false));

        this.copyspikes_r33 = new AdvancedModelRenderer(this);
        this.copyspikes_r33.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r33);
        this.setRotateAngle(copyspikes_r33, -0.6541F, 1.0303F, 0.1675F);
        this.copyspikes_r33.cubeList.add(new ModelBox(copyspikes_r33, 16, 17, 0.8301F, -3.4655F, -6.8532F, 0, 1, 6, 0.0F, false));

        this.copyspikes_r34 = new AdvancedModelRenderer(this);
        this.copyspikes_r34.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r34);
        this.setRotateAngle(copyspikes_r34, -0.9486F, 1.2001F, -0.1054F);
        this.copyspikes_r34.cubeList.add(new ModelBox(copyspikes_r34, 16, 18, -0.1699F, -3.9655F, -6.8532F, 0, 1, 6, 0.0F, false));

        this.copyspikes_r35 = new AdvancedModelRenderer(this);
        this.copyspikes_r35.setRotationPoint(-2.8821F, 0.9114F, -0.4933F);
        this.shell.addChild(copyspikes_r35);
        this.setRotateAngle(copyspikes_r35, -1.9677F, 1.3407F, -0.906F);
        this.copyspikes_r35.cubeList.add(new ModelBox(copyspikes_r35, 0, 32, -1.9199F, -4.7155F, -6.8532F, 0, 1, 5, 0.0F, false));

        this.copyspikes_r36 = new AdvancedModelRenderer(this);
        this.copyspikes_r36.setRotationPoint(-0.9336F, -1.1501F, 4.6387F);
        this.shell.addChild(copyspikes_r36);
        this.setRotateAngle(copyspikes_r36, 2.6577F, 0.4064F, -2.9287F);
        this.copyspikes_r36.cubeList.add(new ModelBox(copyspikes_r36, 0, 1, 0.75F, -1.75F, -2.5F, 0, 1, 4, 0.0F, false));

        this.copyspikes_r37 = new AdvancedModelRenderer(this);
        this.copyspikes_r37.setRotationPoint(-0.9336F, -1.1501F, 4.6387F);
        this.shell.addChild(copyspikes_r37);
        this.setRotateAngle(copyspikes_r37, 2.8638F, 0.2115F, -2.8255F);
        this.copyspikes_r37.cubeList.add(new ModelBox(copyspikes_r37, 0, 7, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.7F, 3.1F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 26, -1.5F, 0.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.8334F, 5.4589F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 2.3562F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 6, 0.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.9094F, 7.0569F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 2.9234F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -2.75F, -1.25F, 0, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.9094F, 7.0569F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.6616F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 0, 0.0F, -0.25F, -2.25F, 0, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.9635F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 0, 0.0F, -5.75F, -11.5F, 0, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.4399F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, -6.25F, -9.5F, 0, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1345F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 15, 0.0F, -5.25F, -9.25F, 0, 1, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8727F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, 0.0F, -4.0F, -9.0F, 0, 1, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 1, 0.0F, -3.0F, -8.5F, 0, 1, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 2, 0.0F, -0.75F, -7.75F, 0, 1, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5 * 0.2F);
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
        this.snail.offsetY = 1.15F;

        EntityPrehistoricFloraSpiniplatyceras ee = (EntityPrehistoricFloraSpiniplatyceras) e;

        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.2F);
        this.foot.setScaleX(scaler2 * 0.9F);

        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
    }

}
